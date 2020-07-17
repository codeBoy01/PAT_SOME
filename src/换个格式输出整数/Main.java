package 换个格式输出整数;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int b=n/100;
int s=(n%100)/10;
int num=(n%100)%10;
while(b>0)
{
	b--;
	System.out.print("B");
	
}
while(s>0)
{
	s--;
	System.out.print("S");
}
for(int i=1;i<=num;i++)
{
	System.out.print(i);
}
}
}
