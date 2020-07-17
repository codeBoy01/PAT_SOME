package 数素数;
import java.util.Scanner;

public class Main {
	public static boolean isPimer(int number){
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
		Scanner input=new Scanner(System.in);
		int n,m;
		n=input.nextInt();
		m=input.nextInt();
		int num=0;
		int i=1;
		while(num<m)
		{
			if(isPimer(i))
			{
				num++;
			
			
				  if(num>=n&&(num-n)%10!=9&&num==m)
				{
					System.out.print(i);
					
				}
                  else if(num>=n&&(num-n)%10!=9)
				{
					System.out.print(i+" ");
					
				}
				else if(num>=n&&num==m)
				{
			    System.out.print(i);
				}
                else if(num>=n)
                {
                    System.out.println(i);
                }
				
			}
			i++;
		}
	}

}
