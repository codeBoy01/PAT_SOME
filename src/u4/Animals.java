package u4;

public class Animals {

public String name;//设置成public修饰，可直接访问
public int age;
public Animals(String name,int age)//有参构造函数
{
	this.name=name;
	this.age=age;
}

public void eat()
	{
		
		System.out.println("吃肉和植物");
	}
}
