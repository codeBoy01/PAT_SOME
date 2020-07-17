package 成绩排序;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 李磊
    * 学号 20180713113
 *
 */
public class Main {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("请输入要输入成绩的人数：");
	int N=input.nextInt();
	double arr[]=new double [N];
	double arr2[]=new double [N];
	for(int i=0;i<N;i++)
	{
		System.out.println("输入第"+(i+1)+"位同学的成绩：");
		arr[i]=input.nextDouble();
	}
	Arrays.sort(arr);
	for(int i=0;i<N;i++)
	{
		arr2[i]=arr[N-i-1];
	}
	for(double grade:arr2)
	{
		String s=String.format("%.1f", grade);
		System.out.println(s);
		
	}
	
	
	
}
}
