package week7.day2;



public class LearnStatic {
	int a=10;
	static int b=20;
	
	
	public void nonStatic() 
	{
		
		a++;
		
		Static();
	}
	
	public void Static() 
	{
		LearnStatic.b++;
		a++;
		b++;
		
		//nonStatic();
	}
	
	public static void staticMethod()
	{
		 System.out.println("Static method called");
	}
	
	public static void main(String[] args) {
		
		
		LearnStatic.staticMethod();
		int h=b;
		System.out.println(h);
		
		LearnStatic obj=new LearnStatic();
		System.out.println(obj.a);
		System.out.println(LearnStatic.b);
		obj.nonStatic();
		obj.Static();
		
		System.out.println(obj.a);
		System.out.println(LearnStatic.b);
	}
}









