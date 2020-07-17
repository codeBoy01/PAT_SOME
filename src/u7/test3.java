package u7;

public class test3 {
public static String convertGrade(double grade) {
	if(grade>90)
	{
		return "A";
	}
	else if(grade>80&&grade<=90)
	{
		return "B";
	}
	else if(grade>70&&grade<=80)
	{
		return "C";
	}
	else if(grade>=60&&grade<=70)
	{
		return "D";
	}
	else {
		return "E";
	}
}
public static void main(String[] args) {
	String dengji=convertGrade(67.5);
	System.out.println("学生成绩等级为："+dengji);
}
}
