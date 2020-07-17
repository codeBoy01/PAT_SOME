package u4;

public class Main {
 public static void main(String[] args) {
	Cat cat =new Cat("咪咪",2);
	System.out.println("名字："+cat.name+",年龄："+cat.age+"岁");
	cat.eat();
}
}
