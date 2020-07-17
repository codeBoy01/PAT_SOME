package 数字黑洞;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int n1;
	String N;
	Scanner input=new Scanner(System.in);
	n1=input.nextInt();
	while(n1<1000)
	{
		n1=n1*10;
	}
	N=String.valueOf(n1);
	char ar1[]=N.toCharArray();
	char ar2[]=new char[ar1.length];
	
	Arrays.sort(ar1);
	for(int i=0;i<ar1.length;i++)
	{
		ar2[i]=ar1[3-i];
	}
	int num1=0,num2=0;
	for(int i=0;i<ar1.length;i++)
	{
		num1=num1*10+Integer.parseInt(String.valueOf(ar1[i]));
		num2=num2*10+Integer.parseInt(String.valueOf(ar2[i]));
	}
	int num=num2-num1;
    if(num==0)
    {
    	System.out.println(N+" - "+N+" = 0000");
    }
    else {
    	System.out.println(num2+" - "+ar1[0]+ar1[1]+ar1[2]+ar1[3]+" = "+num);
    	while(num!=6174)
    	{
    		String str1=String.valueOf(num);
    		ar1=str1.toCharArray();
    		Arrays.sort(ar1);
    		for(int i=0;i<ar1.length;i++)
    		{
    			ar2[i]=ar1[3-i];
    		}
    	num1=0;num2=0;
    		for(int i=0;i<ar1.length;i++)
    		{
    			num1=num1*10+Integer.parseInt(String.valueOf(ar1[i]));
    			num2=num2*10+Integer.parseInt(String.valueOf(ar2[i]));
    		}
    		num=num2-num1;
    		System.out.println(num2+" - "+ar1[0]+ar1[1]+ar1[2]+ar1[3]+" = "+num);
    	}
    }
	
}
}
