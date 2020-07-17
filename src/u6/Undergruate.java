package u6;

public class Undergruate extends Student{
private String name;
private int age;
private String degree;
public Undergruate(String name, int age,String degree) {
	super(name, age);
		this.name = name;
		this.age = age;
		this.degree=degree;
	}
	@Override
	public void show() {
		System.out.println("姓名:"+name);
		System.out.println("年龄:"+age);
		System.out.println("学位:"+degree);
	}


}
