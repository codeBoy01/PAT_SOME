package u4;

public class Cat extends Animals{

	public Cat(String name, int age) //继承父类有参函数
	{
		super(name, age);
	}

	@Override
	public void eat() //重写方法
	{
		System.out.println("吃鱼和老鼠");
	}

}
