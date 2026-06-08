package week7.day2;

public class LearnExceptions {

	public static void main(String[] args) {
		try 
		{
			String s=null;
			System.out.println(s.length()+1);
		} 
		
		catch (ArithmeticException e) 
		{
			System.out.println("jonwsd");
		}
		catch (Exception e) 
		{
			System.out.println("nh");
		}
		finally 
		{
			System.out.println("eddd");
		}
		
		System.out.println("dxasd");
	}
}
