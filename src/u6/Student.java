package u6;

public class Student {
private String name;
private int age;
public Student(String name, int age) 
{
	this.name = name;
	this.age = age;
}
public void show()
{
	System.out.println("姓名:"+name);
	System.out.println("年龄:"+age);
}

}
