package 三角形;

public class TriangleTest {
public static void main(String[] args) {
	TriAngle t1=new TriAngle(3, 4, 5);
	if(t1.flag())
	{
		System.out.println("可以构成三角形");
	}
	else {
		System.out.println("不可构成三角形");
	}
	System.out.println("三角形周长:"+t1.perimeter());
	System.out.println("三角形周长:"+t1.area());
	
}
}
