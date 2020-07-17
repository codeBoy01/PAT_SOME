package 打印沙漏;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	String str=input.next();
	int sum=1;
	int N=6;	
	num=num-1;
	while(num/N>0)
	{
		num=num-N;
		N=N+4;
		sum++;	
	}
	String s3="";
	for(int i=sum-1;i>0;i--)
	{ 
		String s="";
		int i2=i;
		while(i2<(sum-1))
		{
			s=s+" ";
			i2++;
		
		}
		s3=s+" ";
		for(int j=0;j<2*i+1;j++)
		{
			s=s+str;
		}
		System.out.println(s);
	}
	System.out.println(s3+str);
	for(int i=0;i<sum-1;i++)
	{ 
		String s2="";
	   int i2=i;
		while(sum>i2+2)
		{
			s2=s2+" ";
			i2++;
		
		}
		for(int j=0;j<2*i+3;j++)
		{
			s2=s2+str;
		}
		System.out.println(s2);
	}
	System.out.println(num);
	
	
}
}
