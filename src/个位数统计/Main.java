package 个位数统计;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String number;
		Scanner input=new Scanner(System.in);
		number=input.next();
		char str[]=number.toCharArray();
		int num0=0;
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=0;
		int num7=0;
		int num8=0;
		int num9=0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]=='0')
			{
				num0++;
			}
			else if(str[i]=='1')
			{
				num1++;
			}
			else if(str[i]=='2')
			{
				num2++;
			}
			else if(str[i]=='3')
			{
				num3++;
			}
			else if(str[i]=='4')
			{
				num4++;
			}
			else if(str[i]=='5')
			{
				num5++;
			}
			else if(str[i]=='6')
			{
				num6++;
			}
			else if(str[i]=='7')
			{
				num7++;
			}
			else if(str[i]=='8')
			{
				num8++;
			}
			else if(str[i]=='9')
			{
				num9++;
			}
		}
		if(num0!=0)
		{
			System.out.println("0:"+num0);
		}
		if(num1!=0)
		{
			System.out.println("1:"+num1);
		}
		if(num2!=0)
		{
			System.out.println("2:"+num2);
		}
		if(num3!=0)
		{
			System.out.println("3:"+num3);
		}
		if(num4!=0)
		{
			System.out.println("4:"+num4);
		}
		if(num5!=0)
		{
			System.out.println("5:"+num5);
		}
		if(num6!=0)
		{
			System.out.println("6:"+num6);
		}
		if(num7!=0)
		{
			System.out.println("7:"+num7);
		}
		if(num8!=0)
		{
			System.out.println("8:"+num8);
		}
		if(num9!=0)
		{
			System.out.println("9:"+num9);
		}
	}

}
