package u1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			int n1,n2,n3;
			n1=input.nextInt();
			n2=input.nextInt();
			n3=input.nextInt();
			if(n1+n2>n3)
			{
				System.out.println("Case #"+i+": true");
			}
			else 
				{
				System.out.println("Case #"+i+": false");
				}
			
			
		}
	}

}
