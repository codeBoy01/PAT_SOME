package 代写1;

public class Rectangle extends Shape{
private double high;
private double width;
	@Override
	public double getPerimeter() {
		
		return 2*(high+width);
	}

	@Override
	public double getArea() {
	
		return high*width;
	}

}
