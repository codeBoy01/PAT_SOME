package 学生管理;
/**
 * @author 李磊
    * 学号 20180713113
 *
 */
public class Student implements IStudy{
	private int number;//学号
	private String name;
	private double english;//英语成绩
	private double computer;//计算机成绩
	public Student(int number, String name, double english, double computer) //有参构造
	{
		this.number = number;
		this.name = name;
		this.english = english;
		this.computer = computer;
	}
	public Student() //无参构造
	{
		this.number=1;
		this.name="李磊";
		this.english=90;
		this.computer=80;
	}
	public void print()//输出信息
	{
		System.out.println("学号"+this.number);
		System.out.println("姓名"+this.name);
		System.out.println("英语成绩"+this.english);
		System.out.println("计算机成绩"+this.computer);
	}
	@Override
	public void study() {
		System.out.println();
		
	}
	
	
	

}
