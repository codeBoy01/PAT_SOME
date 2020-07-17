package 福尔摩斯的约会;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	String word1,word2,word3,word4;
	Scanner input=new Scanner(System.in);
	word1=input.next();
	word2=input.next();
	word3=input.next();
	word4=input.next();
	String s1 = null,s2=null;
			int s3=0;
	 char[] ar1 =word1.toCharArray();
	 char[] ar2 =word2.toCharArray();
	 char[] ar3 =word3.toCharArray();
	 char[] ar4 =word4.toCharArray();
	 int le=ar2.length;
	 if(ar1.length<ar2.length)
	 {
		 le=ar1.length;
	 }
	 int le2=ar4.length;
	 if(ar3.length<ar4.length)
	 {
		 le2=ar3.length;
	 }
	 for(int i=0;i<le2;i++)
	 {
		 if(ar3[i]==ar4[i]&&((ar3[i]>='A'&&ar3[i]<='Z')||(ar3[i]>='a'&&ar3[i]<='z')))
		 {
			 s3=i;
			 break;
		 }
		 
	 }
	 boolean flag=false;
	 for(int i=0;i<le;i++)
	 {
		 if(!flag&&ar1[i]==ar2[i]&&ar1[i]>='A'&&ar2[i]<='G')
		 {
			 flag=true;
			 if(ar1[i]=='A')
			 {
				 s1="MON";
			 }
			 else if(ar1[i]=='B')
			 {
				 s1="TUE";
			 }
			 else if(ar1[i]=='C')
			 {
				 s1="WED";
			 }
			 else if(ar1[i]=='D')
			 {
				 s1="THU";
			 }
			 else if(ar1[i]=='E')
			 {
				 s1="FRI";
			 }
			 else if(ar1[i]=='F')
			 {
				 s1="SAT";
			 }
			 else 
			 {
				 s1="SUN";
			 }
			
		 }
		 else if(flag&&ar1[i]==ar2[i])
		 {
			 if(ar1[i]=='0')
			 {
				 s2="00";
			 }
			 else if(ar1[i]=='1')
			 {
				 s2="01";
			 }
			 else if(ar1[i]=='2')
			 {
				 s2="02";
			 }
			 else if(ar1[i]=='3')
			 {
				 s2="03";
			 }
			 else if(ar1[i]=='4')
			 {
				 s2="00";
			 }
			 else if(ar1[i]=='5')
			 {
				 s2="05";
			 }
			 else if(ar1[i]=='6')
			 {
				 s2="06";
			 }
			 else if(ar1[i]=='7')
			 {
				 s2="07";
			 }
			 else if(ar1[i]=='8')
			 {
				 s2="08";
			 }
			 else if(ar1[i]=='9')
			 {
				 s2="09";
			 }
			 else if(ar1[i]=='A')
			 {
				 s2="10";
			 }
			 else if(ar1[i]=='B')
			 {
				 s2="11";
			 }
			 else if(ar1[i]=='C')
			 {
				 s2="12";
			 }
			 else if(ar1[i]=='D')
			 {
				 s2="13";
			 }
			 else if(ar1[i]=='E')
			 {
				 s2="14";
			 }
			else if(ar1[i]=='F')
			 {
				 s2="15";
			 }
			 else if(ar1[i]=='G')
			 {
				 s2="16";
			 }
			 else if(ar1[i]=='H')
			 {
				 s2="17";
			 }
			 else if(ar1[i]=='I')
			 {
				 s2="18";
			 }
			 else if(ar1[i]=='J')
			 {
				 s2="19";
			 }
			 else if(ar1[i]=='K')
			 {
				 s2="20";
			 }
			 else if(ar1[i]=='L')
			 {
				 s2="21";
			 }
			 else if(ar1[i]=='M')
			 {
				 s2="22";
			 }
			 else if(ar1[i]=='N')
			 {
				 s2="23";
			 }
			 else 
			 {
				 
				 continue;
			}
			 break;
			 
		 }
		 
	 }
	 if(s3<=9&&s3>=0)
	 {
	 System.out.println(s1+" "+s2+":0"+s3);
	 } 
	 else {
		 System.out.println(s1+" "+s2+":"+s3);
	}
}
}
