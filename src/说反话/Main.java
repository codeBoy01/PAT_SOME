package 说反话;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String string=input.nextLine();
	String str2[]=string.split(" ");
	for(int i=str2.length-1;i>0;i--)
	{
		System.out.print(str2[i]+" ");
	}
	System.out.print(str2[0]);
	}
}
