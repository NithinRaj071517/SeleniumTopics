package week1.day2;

public class LearnMethods {
	
	public int number=7;
	private String name="TestLeaf";
	
	public void printMyName()
	{
		System.out.println("Testleaf");
	}
	
	private int getCardPin()
	{
		int pin=2344;
		return pin;
				
	}
	
	 public double addTwoNumbers(double a, double b )
	 {
		 return a+b;
	 }
	 
	 public String getCarName()
	 {
		 return "Duster";
	 }
	 
	 public static void main(String[] args) 
	 {
		 LearnMethods obj=new LearnMethods();
		 
		 //TO access variables
		 int a=obj.number;
		System.out.println(a);
		 String name2 = obj.name; 
		 System.out.println(name2);
		 
		 
		 //To access methods
		 obj.printMyName();
		 int cardPin = obj.getCardPin();
		 System.out.println(cardPin);
		 double result = obj.addTwoNumbers(2.50,3.50);
		 System.out.println(result);
		 
		 String carName = obj.getCarName();
		 System.out.println(carName);
		 
	 }
}
