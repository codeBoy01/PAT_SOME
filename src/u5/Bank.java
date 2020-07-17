package u5;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		double price;//单价
		int num;//数量
		double money;//输入金额
		double amount;//应收金额
		double change;//找零
		System.out.println("请输入单价（￥）：");
		price=inputScanner.nextDouble();
		System.out.println("请输入数量：");
		num=inputScanner.nextInt();
		System.out.println("请输入金额（￥）：");
		money=inputScanner.nextDouble();
	    amount=price*num;
	    if(amount>=500)
	    {
	    	amount=amount*0.8;
	    }
	    change=money-amount;
	    if(change>=0)
	    {
	    	String str1=String.format("%.1f", amount);//保留一位小数
	    	String str2=String.format("%.1f", change);
	    	System.out.println("应收金额为：￥"+str1+",找零为：￥"+str2);
	    	
	    }
	    else 
	    {
	    	
	    	System.out.println("付款金额不够！");	
	    	
		}
	}

}
