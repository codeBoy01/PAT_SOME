package u2;

import java.util.List;
import java.util.Scanner;

import javax.security.sasl.SaslException;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N;
		int A1=0,A2=0,A3=0,A5=0;
		double A4 = 0;
		int num1=0,num2=0,num3=0,num4=0,num5=0;
		boolean flag=false;
		N=input.nextInt();
		int a[]=new int[N];
		for (int i=0;i<N;i++)
		{
			a[i]=input.nextInt();
			
		}
		for (int i=0;i<N;i++)
		{
			//1.A1=能被5整除的数字中所有偶数的和
			if(a[i]%5==0&&a[i]%2==0)
			{
				A1+=a[i];
				num1++;
			}
			//2.A2=将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
			if(a[i]%5==1)
			{
				num2++;
				if(flag==false)
				{
					A2+=a[i];
					flag=true;
					
				}
				else 
				{
					A2-=a[i];
					flag=false;
						
				}
				
			}
			//3.A3 = 被5除后余2的数字的个数；
			if(a[i]%5==2)
			{
				A3++;
				num3++;
			}
			//4.A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
			if(a[i]%5==3)
			{
				A4+=a[i];
				num4++;
			}
			//5.A5 = 被5除后余4的数字中最大数字。
			if(a[i]%5==4)
			{
				num5++;
				if(A5<a[i])
				{
					A5=a[i];
				}
			}
		}
		String s1,s2,s3,s4,s5;
		if(num1==0) 
		{
			s1="N";
		}
		else {
		   s1=String.format("%d", A1);
		}
		if(num2==0) 
		{
			s2="N";
		}
		else {
		   s2=String.format("%d", A2);
		}
		if(num3==0) 
		{
			s3="N";
		}
		else {
		   s3=String.format("%d", A3);
		}
		if(num4==0)
		{
			s4="N";
		}
		else 
		{
			s4=String.format("%.1f", A4/num4);
		}
		if(num5==0)
		{
			s5="N";
		}
		else {
			s5=String.format("%d",A5);
		}
		
		System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
		
				
	}

}
