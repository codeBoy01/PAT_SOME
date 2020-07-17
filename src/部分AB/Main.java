package 部分AB;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String A,B,DA,DB;
		
	Scanner input=new Scanner(System.in);
	A=input.next();
	DA=input.next();
	B=input.next();
	DB=input.next();
	 char[] ar1 =A.toCharArray();
	 char[] ar2=B.toCharArray();
	 char da=DA.charAt(0);
	 char db=DB.charAt(0);
	 int num1=0,num2=0;
	 for(int i=0;i<ar1.length;i++)
	 {
		 if(ar1[i]==da)
		 {
			 num1++;
		 }
	 }
	 for(int i=0;i<ar2.length;i++)
	 {
		 if(ar2[i]==db)
		 {
			 num2++;
		 }
	 }
	 int a1=Integer.parseInt(DA);
	 int a2=Integer.parseInt(DB);
	 int score1=0,score2=0;
	
	 while(num1>0)
	 {
		 num1--;
		 score1=score1*10+a1;
	 }
	 while(num2>0)
	 {
		 num2--;
		 score2=score2*10+a2;
	 }
	  System.out.println(score1+score2);
	                    
	}
	                                                                                                           

}
