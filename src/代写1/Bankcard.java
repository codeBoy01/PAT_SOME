package 代写1;

public class Bankcard {

private long cardno;//卡号
private String password;//密码
private double balance;//余额
private String name;//姓名
private String ID;//身份证号
//构造函数
public Bankcard(long cardno, String password, double balance, String name, String ID) {

	this.cardno = cardno;
	this.password = password;
	this.balance = balance;
	this.name = name;
	this.ID = ID;
}
public void deposit(double money)//存款
{
	this.balance+=money;
	System.out.println("存款成功！");
}
public void drawmoney(double money)//取款
{
	if(this.balance<money)
	{
		System.out.println("余额不足，取款失败！");
	}
	else 
	{
		this.balance-=money;
		System.out.println("取款成功！");
		
	}
}
public void changed(String str)//修改密码
{
	this.password=str;
	System.out.println("修改密码成功！");
}
public double getbalance()//查阅
{
	return this.balance;
}
public String  getname()//查姓名
{
	return this.name;
}
public String getid()//查密码
{
	return this.password;
}
}
