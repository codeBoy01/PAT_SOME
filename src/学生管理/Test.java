package 学生管理;

/**
 * @author 李磊
    * 学号 20180713113
 *
 */
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("请输入学号");
	int xh1=input.nextInt();
	System.out.println("请输入姓名");
	String name1=input.next();
	System.out.println("请输入英语成绩");
	double en1=input.nextDouble();
	System.out.println("请输入计算机成绩");
	double com1=input.nextDouble();
	Student s1=new Student(xh1,name1,en1,com1);
	s1.print();
	System.out.println("请输入学号");
	int xh2=input.nextInt();
	System.out.println("请输入姓名");
	String name2=input.next();
	System.out.println("请输入英语成绩");
	double en2=input.nextDouble();
	System.out.println("请输入计算机成绩");
	double com2=input.nextDouble();
	System.out.println("请输入导师姓名");
	String g_name=input.next();
	System.out.println("请输入研究方向");
	String g_director=input.next();
	PostGraduate s2=new PostGraduate(xh2, name2, en2, com2, g_name, g_director);
	s2.print();
	//调用接口
	s1.study();
	s2.study();
}
}
