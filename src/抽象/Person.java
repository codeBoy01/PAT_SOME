package 抽象;

public abstract class Person {
private String name;
public Person(String name)
{
	this.setName(name);
}
 public abstract void speak();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
