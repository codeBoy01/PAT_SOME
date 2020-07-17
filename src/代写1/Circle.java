package 代写1;

public class Circle extends Shape{
private double r;
	@Override
	public double getPerimeter() {
		
		return r*3.14*2;
	}

	@Override
	public double getArea() {
		
		return r*3.14*3.14;
	}

}
