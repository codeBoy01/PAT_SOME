package 组个最小数;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num0=input.nextInt();
	int num1=input.nextInt();
	int num2=input.nextInt();
	int num3=input.nextInt();
	int num4=input.nextInt();
	int num5=input.nextInt();
	int num6=input.nextInt();
	int num7=input.nextInt();
	int num8=input.nextInt();
	int num9=input.nextInt();
	int num[]=new int [9];
	num[0]=num1;
	num[1]=num2;
	num[2]=num3;
	num[3]=num4;
	num[4]=num5;
	num[5]=num6;
	num[6]=num7;
	num[7]=num8;
	num[8]=num9;
	if(num0==0) 
	{
		while(num1!=0) {
			num1--;
			System.out.print(1);
		}
		while(num2!=0) {
			num2--;
			System.out.print(2);
		}
		while(num3!=0) {
			num3--;
			System.out.print(3);
		}
		while(num4!=0) {
			num4--;
			System.out.print(4);
		}
		while(num5!=0) {
			num5--;
			System.out.print(5);
		}
		while(num6!=0) {
			num6--;
			System.out.print(6);
		}
		while(num7!=0) {
			num7--;
			System.out.print(7);
		}
		while(num8!=0) {
			num8--;
			System.out.print(8);
		}
		while(num9!=0) {
			num9--;
			System.out.print(9);
		}
		
	}
	else 
	{
		boolean flag=true;
		for(int i=0;i<9;i++)
		{
			if(num[i]!=0&&flag)
			{
				flag=false;
				System.out.print(i+1);
				num[i]--;
				while(num0!=0)
				{
					num0--;
					System.out.print(0);
				}
				while(num[i]!=0)
				{
					num[i]--;
					System.out.print(i+1);
					
				}
			}
			else if(num[i]!=0&&!flag)
			{
				
				
				while(num[i]!=0)
				{num[i]--;
					System.out.print(i+1);
					
				}
			}
			
		}
		
	}
	
}
}
