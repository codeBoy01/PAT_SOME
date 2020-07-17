package 三角形;

public class TriAngle {
private double a;
private double b;
private double c;
public TriAngle(double a,double b,double c) {
	
	this.a=a;
	this.b=b;
	this.c=c;
}
public boolean flag()
{
	if((a+b)>c&&(a+c)>b&&(b+c)>a)
       return true;
    else
      return false;
    

}
public double perimeter()
{
	return a+b+c;
}
public double area()
{
	 double p=(a+b+c)/2;
	 double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
	return S;
}
}
