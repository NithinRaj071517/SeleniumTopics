package week1.day1;

public class LearnElseIfstatement {
	public static void main(String[] args) {
		int mark=78;
		
		if (mark<=100 && mark>=80)
		{
			System.out.println("A");
		}
		else if (mark<80 && mark>=60)
		{
			System.out.println("B");
		}
		else if (mark<60 && mark>=35)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("F");
		}
	}

}
