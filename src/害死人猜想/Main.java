package 害死人猜想;


import java.util.Scanner;

public class Main {
	static int sum=0;
public static void main(String[] args) {
	Scanner inputScanner=new Scanner(System.in);
	int n=inputScanner.nextInt();
    Callatz(n);
    System.out.println(sum);
	
}
public static void Callatz(int value) {
	if(value!=1)
	{
		if(value%2==0)
		{
			value=value/2;
			sum++;
			Callatz(value);
		}
		else 
		{
			value=(3*value+1)/2;
			sum++;
			Callatz(value);
			
		}
		
	}
	
}
}
