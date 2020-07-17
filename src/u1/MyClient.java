package u1;
 
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
 
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.net.SocketFactory;
import javax.swing.JButton;
 
public class MyClient extends JFrame {
 
	private JPanel contentPane;
	private static JTextField jf = new JTextField();
	static JTextArea jta = new JTextArea();
	static JButton bt = new JButton("\u53D1\u9001");
	static Scanner sc =new Scanner(System.in);
	static Socket socket;
 
 
	/**
	 * Launch the application.
	 * 
	 * @throws IOException
	 * @throws UnknownHostException
	 */
 
	public static void main(String[] args) throws UnknownHostException, IOException {
		new MyClient();
		socket = new Socket("localhost", 12345);//创建本机socket
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		new SendThread(br).start();//启动读的线程
	}
	/**
	 * Create the frame.
	 */
	public MyClient() {
		setTitle("\u5BA2\u6237\u7AEF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 229, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
 
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 213, 226);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
 
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scrollPane, BorderLayout.CENTER);
		jta.setEditable(false);
 
		jta.setLineWrap(true);
		jta.setFont(new Font("幼圆", Font.PLAIN, 16));
		scrollPane.setViewportView(jta);
 
		jf.setFont(new Font("幼圆", Font.PLAIN, 16));
		jf.setBounds(0, 236, 133, 33);
		contentPane.add(jf);
		jf.setColumns(10);
		setVisible(true);
 
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				try {
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					pw.println(jf.getText());
					pw.flush();
					jta.append("客户端:"+jf.getText()+'\n');
					jf.setText("");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		bt.setBounds(143, 236, 60, 33);
		contentPane.add(bt);
	}
	
	static class SendThread extends Thread {
		BufferedReader br;
 
		public SendThread(BufferedReader br) {
			super();
			this.br = br;
		}
		@Override
		public void run() {
			String line =null;
			try {
				while((line=br.readLine())!=null) {
					jta.append("服务器:" + line + '\n');
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}