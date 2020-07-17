package u1;
 
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
 
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
 
public class MySever extends JFrame {
 
	private JPanel contentPane;
	private JTextField jf = new JTextField();
	static JTextArea jta = new JTextArea();
	static JButton bt = new JButton("\u53D1\u9001");
	static Socket accept;
 
	/**
	 * Launch the application.
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
 
		new MySever();
		ServerSocket sever = new ServerSocket(12345);
		accept = sever.accept();//接连进来的客户端
		BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
		while (true) {
			String str = br.readLine();
			jta.append("客户端:" + str + '\n');
		}
	}
 
	/**
	 * Create the frame.
	 */
	public MySever() {
		setTitle("\u670D\u52A1\u5668");
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
 
		bt.setBounds(143, 236, 60, 33);
		bt.addActionListener(new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					PrintWriter pw = new PrintWriter(accept.getOutputStream());
					pw.println(jf.getText());
					pw.flush();//刷新缓冲区
					jta.append("服务器:" + jf.getText() + '\n');
					jf.setText("");
				} catch (IOException e) {
					e.printStackTrace();
				}
 
			}
		});
		contentPane.add(bt);
		setVisible(true);
	}
}