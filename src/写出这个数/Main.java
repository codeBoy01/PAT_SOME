
package 写出这个数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     String str1=input.next();
	     char str2[]=str1.toCharArray();
	     int sum=0;
	     for(int i=0;i<str2.length;i++)
	     {
	    	 sum=sum+Integer.parseInt(String.valueOf(str2[i]));
	     }
	    String str3=String.valueOf(sum);
	    char str4[]=str3.toCharArray();
	    for(int i=0;i<str4.length;i++)
	    {
	    	if(i!=str4.length-1)
	    	{
	    		if(str4[i]=='0')
	    		{
	    			System.out.print("ling"+" ");
	    		}
	    		else if(str4[i]=='1')
	    		{
	    			System.out.print("yi"+" ");
	    		}
	    		else if(str4[i]=='2')
	    		{
	    			System.out.print("er"+" ");
	    		}
	    		else if(str4[i]=='3')
	    		{
	    			System.out.print("san"+" ");
	    		}
	    		else if(str4[i]=='4')
	    		{
	    			System.out.print("si"+" ");
	    		}
	    		else if(str4[i]=='5')
	    		{
	    			System.out.print("wu"+" ");
	    		}
	    		else if(str4[i]=='6')
	    		{
	    			System.out.print("liu"+" ");
	    		}
	    		else if(str4[i]=='7')
	    		{
	    			System.out.print("qi"+" ");
	    		}
	    		else if(str4[i]=='8')
	    		{
	    			System.out.print("ba"+" ");
	    		}
	    		else if(str4[i]=='9')
	    		{
	    			System.out.print("jiu"+" ");
	    		}
	    	}
	    	else {
	    		if(str4[i]=='0')
	    		{
	    			System.out.print("ling");
	    		}
	    		else if(str4[i]=='1')
	    		{
	    			System.out.print("yi");
	    		}
	    		else if(str4[i]=='2')
	    		{
	    			System.out.print("er");
	    		}
	    		else if(str4[i]=='3')
	    		{
	    			System.out.print("san");
	    		}
	    		else if(str4[i]=='4')
	    		{
	    			System.out.print("si");
	    		}
	    		else if(str4[i]=='5')
	    		{
	    			System.out.print("wu");
	    		}
	    		else if(str4[i]=='6')
	    		{
	    			System.out.print("liu");
	    		}
	    		else if(str4[i]=='7')
	    		{
	    			System.out.print("qi");
	    		}
	    		else if(str4[i]=='8')
	    		{
	    			System.out.print("ba");
	    		}
	    		else if(str4[i]=='9')
	    		{
	    			System.out.print("jiu");
	    		}
			}
	    }
	}

}
