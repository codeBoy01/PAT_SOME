package 抽象;

public class Doctor extends Worker implements Behavior{
private String workplace;
	public Doctor(String name,String workplace) {
		super(name);
		this.setName(name);
		this.workplace=workplace;
	}

	@Override
	public void eat() {
		System.out.println("吃食堂套餐");
		
	}

	@Override
	public void walk() {
      System.out.println("快走");
		
	}

	@Override
	public void work() {
	   System.out.println("看病开药");	
	}

	@Override
	public void speak() {
		System.out.println("给病人说诊断情况");
	}

	public void serchRoom()
	{
		System.out.println("医生姓名："+this.getName());
		System.out.println("工作地点："+this.workplace);
	}
}
