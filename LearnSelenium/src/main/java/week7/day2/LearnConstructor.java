package week7.day2;

public class LearnConstructor {
	
	public LearnConstructor() 
	{
		System.out.println("The name is");
		
	}
	
	public LearnConstructor(String name) 
	{
		System.out.println("The name is,"+name);
		
	}
	
	public void printMyname()
	{ 
		System.out.println("Call me NK");
	}
	
	public static void main(String[] args) {
		LearnConstructor obj=new LearnConstructor("Lokesh");
		obj.printMyname();
	}
}
