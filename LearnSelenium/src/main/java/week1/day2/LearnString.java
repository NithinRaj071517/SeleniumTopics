package week1.day2;

public class LearnString {
	public static void main(String[] args) {
		
		String name="TestLeaf";  // String Literal
		String name1="TestLeaf";
		String fed=new String("TestLeaf"); //String Object
		String fed1=new String("TestLeaf"); //String Object
		
		if(fed.equals(fed1))
		{
			System.out.println("yes");
		
		}
		else
		{
			System.out.println("No");
		
		}
		
		if(name==name1)
		{
			System.out.println("yes");
		
		}
		else
		{
			System.out.println("No");
		
		}
	}
}
