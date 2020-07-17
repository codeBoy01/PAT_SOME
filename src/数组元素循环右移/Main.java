package 数组元素循环右移;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n,m;

	n=input.nextInt();
	m=input.nextInt();
	int ge=n-m;
	if(ge<0)
	{
		ge=0;
		m=n;
	}
	 int nums[]=new int [n];
	 for(int i=0;i<n;i++)
	 {
		 nums[i]=input.nextInt();
	 }
	 int nums2[]=nums.clone();
	for(int i=0;i<m;i++)
	{
		nums2[i]=nums[ge];
		ge++;
	}
	int chu=0;
	for(int i=m;i<n;i++)
	{
		nums2[i]=nums[chu];
		chu++;
	}
	 for (int i = 0; i < nums2.length-1; i++) 
	 {
		System.out.print(nums2[i]+" ");
	}
	 System.out.println(nums2[nums2.length-1]);

}
}
