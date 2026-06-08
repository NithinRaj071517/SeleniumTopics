package week8.day2;

public class LearnEncapsulationClass2 {
	public static void main(String[] args) {
		LearnEncapsulationClass1 we = new LearnEncapsulationClass1();
		int ws = we.nitter();
		
		System.out.println("class2");
		System.out.println(ws);
		we.bitter(34);
		int ws1 = we.nitter();
		
		System.out.println("class1");
		System.out.println(ws1);
	}

}
