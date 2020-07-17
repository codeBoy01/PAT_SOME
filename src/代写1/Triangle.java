package 代写1;

public class Triangle extends Shape{
private double s1;
private double s2;
private double s3;

	@Override
	public double getPerimeter() {
		
		return s1+s2+s3;
	}

	@Override
	public double getArea() {
	 double p=(s1+s2+s3)/2;
	 double S=Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
		return S;
	}

}
