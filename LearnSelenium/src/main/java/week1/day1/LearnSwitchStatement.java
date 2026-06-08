package week1.day1;

public class LearnSwitchStatement {
	public static void main(String[] args) {
		String option="se";
		
		switch (option)
		{
		case "Balcony":
			System.out.println("250");
			break;
		
		case "F1":
			System.out.println("200");
			break;
			
		case "F2":
			System.out.println("100");
			break;
			
		default:
			System.out.println("Ticket illa");
			break;
		}
	}
}
