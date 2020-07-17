package 科学计数法;

import java.util.Scanner;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Main {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String N=input.next();
	String N2[]=N.split("E");
	//split方法遇到.和|时，需添加\\进行转义
    String N3[]=N2[0].split("\\.");
    char str1[]=N2[0].toCharArray();
    char str2[]=N2[1].toCharArray();
    if(str1[0]=='-')
    {
    System.out.print('-');
    }
    if(str2[0]=='-')
    {
    	int wei=0;
       for(int i=1;i<str2.length;i++)
       {
    	   int num=Integer.parseInt(String.valueOf(str2[i]));
    	   wei=wei*10+num;
       }
       String str3="";
       while(wei>1)
       {
    	   str3=str3+"0";
    	   wei--;
       }
       System.out.println("0."+str3+str1[1]+N3[1]);
    }
    else
    {
    	int Wei=0;
    	for(int i=1;i<str2.length;i++)
        {
     	   int num=Integer.parseInt(String.valueOf(str2[i]));
     	   Wei=Wei*10+num;
        }
    	if(str1[1]=='0')
    	{
    		 char N4[]=N3[1].toCharArray();
 			for(int i=0;i<N4.length;i++)
 			{
 				if(Wei==i)
 				{
 					System.out.print("."+N4[i]);
 				}
 				else {
 					System.out.print(N4[i]);
 				}
 				
 			}
 			while(Wei>N4.length)
			{
				Wei--;
				System.out.print('0');
			}
    	}
    	else {
    	    char N4[]=N3[1].toCharArray();
    	    System.out.print(str1[1]);
			for(int i=0;i<N4.length;i++)
			{
				if(Wei==i)
				{
					System.out.print("."+N4[i]);
				}
				else {
					System.out.print(N4[i]);
				}
			
				
			}
			while(Wei>N4.length)
			{
				Wei--;
				System.out.print('0');
			}
		}
    }
}
}  
