package 学生管理;

/**
 * @author 李磊
    * 学号 20180713113
 *
 */
public class PostGraduate extends Student implements IStudy{
private String g_name;//导师姓名
private String g_direction;//研究方向
public PostGraduate(int number, String name, double english, double computer, String g_name, String g_direction) {
	super(number, name, english, computer);
	this.g_name = g_name;
	this.g_direction = g_direction;
}
@Override
public void print() {
	
	super.print();
	System.out.println("导师姓名"+this.g_name);
	System.out.println("研究方向"+this.g_direction);
	
}
@Override
public void study() {
	System.out.println();
}



}
