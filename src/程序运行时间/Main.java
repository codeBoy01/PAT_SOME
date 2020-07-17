package 程序运行时间;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int c1=input.nextInt();
	int c2=input.nextInt();
	int c3=(c2-c1)/100;

	if((c2-c1)%100>=50)
{
	c3=c3+1;
}
	int c4=c3/3600;
	int c5=c3%3600;
	int c6=c5/60;
	int c7=c5%60;
	if(c4>=10)
	{
		System.out.print(c4+":");
	}
	else {
		System.out.print("0"+c4+":");
	}
	if(c6>=10)
	{
		System.out.print(c6+":");
	}
	else {
		System.out.print("0"+c6+":");
	}
	if(c7>=10)
	{
		System.out.print(c7);
	}
	else {
		System.out.print("0"+c7);
	}
}
}
