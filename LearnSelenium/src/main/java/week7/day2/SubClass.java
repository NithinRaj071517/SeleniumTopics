package week7.day2;

public class SubClass extends SuperClass{
	public int a=15;
	public void method1() 
	{
		System.out.println("SubClass");
		System.out.println(super.a);
		System.out.println(this.a);
	}
	
	public void name() 
	{
		super.method1();	
		this.method1();
	}
	
	public static void main(String[] args) {
		SubClass oj=new SubClass();
		oj.name();
	}
	

}
