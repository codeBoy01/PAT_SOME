package 成绩排名;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	String str1[]=new String[n];
	String str2[]=new String[n];
	int score[]=new int[n];
	for(int i=0;i<n;i++) {
		str1[i]=input.next();
		str2[i]=input.next();
		score[i]=input.nextInt();
	}
	int score2[]=score.clone();
	
	Arrays.sort(score2);
	for(int i=0;i<n;i++) 
	{
		if(score[i]==score2[n-1])
		{
			System.out.println(str1[i]+" "+str2[i]);
		}
	}
	for(int i=0;i<n;i++) 
	{
		if(score[i]==score2[0])
		{
			System.out.println(str1[i]+" "+str2[i]);
		}
	}
}
}
