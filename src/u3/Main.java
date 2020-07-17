package u3;

import java.util.Scanner;

public class Main {
	public static boolean isPrime(int number){
        if(number<2){//若此数小于2，则不是质数
            return false;
        }
        //从1-number本身循环取余计算
        for(int i=1;i<number;i++){
            if(number % i == 0){//余数为0，能整除
                if(number == i){//是否是本身
                    return true;
                }else if(i!=1){//是否是1
                    return false;
                }
            }
        }
        return true;
    }


	public static void main(String[] args) {
		int m,n;
		Scanner input=new Scanner(System.in);
		m=input.nextInt();
		n=input.nextInt();
		int i=2;
		int num=0;
		int i2=1;
		while(num<=n)
		{
			if(isPrime(i)) 
			{
				if(num>=m-1&&num<=n-1&&i2%10!=0)
				{
				System.out.print(i+" ");
				i2++;	
				num++;
				i++;
				
				}
				else if(num>=m-1&&num<=n-1&&i2!=0&&i2%10==0)
				{
				System.out.println(i);
				i2++;	
				num++;
				i++;
				
			     }
				else 
				{
					num++;
				i++;
				}
				
			
			}
			else
			{
				i++;
				
			}
	
		
		
		}
		
	}
}
