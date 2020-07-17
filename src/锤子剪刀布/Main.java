package 锤子剪刀布;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int N;
	N=input.nextInt();
	char[] ar1= new char[N];
	char[] ar2= new char[N];
	char[] ar3= new char[N];
	char[] ar4= new char[N];
	
	int num1=0,num2=0,num3=0;
	int j1=0,j2=0,b1=0,b2=0,c1=0,c2=0;
	for(int i=0;i<N;i++)
	{
		ar1[i]=(input.next()).charAt(0);
		ar2[i]=(input.next()).charAt(0);
	}
	for(int i=0;i<N;i++)
	{
		if(ar1[i]=='J')
		{
			if(ar2[i]=='J')
			{
				num3++;
			}
			else if(ar2[i]=='B')
			{
				num1++;
				j1++;
			}
			else {
				num2++;
				c2++;
			}
		}
		else if(ar1[i]=='B')
		{
			if(ar2[i]=='J')
			{
				num2++;
				j2++;
			}
			else if(ar2[i]=='B')
			{
				num3++;
			}
			else {
				num1++;
				b1++;
			}
		}
		else {
			if(ar2[i]=='J')
			{
				num1++;
				c1++;
			}
			else if(ar2[i]=='B')
			{
				num2++;
				b2++;
			}
			else {
				num3++;
			}
		}
	}
	
	System.out.println(num1+" "+num3+" "+num2);
	System.out.println(num2+" "+num3+" "+num1);
	if(b1>=c1 && b1>=j1){
		System.out.print("B");
	}
	else if(c1>=j1)
	{
		System.out.print("C");
	}
	else 
	{
		System.out.print("J");
	}
	if(b2>=c2 && b2>=j2){
		System.out.print(" "+"B");
	}
	else if(c2>=j2)
	{
		System.out.print(" "+"C");
	}
	else 
	{
		System.out.print(" "+"J");
	}

	
	
}
}
