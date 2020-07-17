package 代写1;

public class TestBankCard {
	public static void main(String[] args) {
	Bankcard b1=new Bankcard(662551524,"992277", 6666,"李", "2424141");
	b1.deposit(10000);
	b1.drawmoney(20000);
	b1.drawmoney(15000);
	b1.changed("882277");
	System.out.println("银行卡余额为："+b1.getbalance());
	System.out.println("账户姓名："+b1.getname());
	System.out.println("账户密码："+b1.getid());
	}

}
