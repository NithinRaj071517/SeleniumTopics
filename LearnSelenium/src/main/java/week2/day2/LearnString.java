package week2.day2;

public class LearnString {
	public static void main(String[] args) {
		String name="TesTleaF";
		System.out.println(name);
		int len=name.length();
		System.out.println(len);
		String upc=name.toUpperCase();
		System.out.println(upc);
		String loc=name.toLowerCase();
		System.out.println(loc);
		
		//String concat
		String s1="Hello";
		String s2="Everyon";
		String s3=s1.concat(s2);
		System.out.println(s3);
		String s4=s1+s2+s3;
		System.out.println(s4);
		String s5=s1+" "+s2+" "+s3;
		
		System.out.println(s5);
		
		
		//String comparison
		String w1="HelloMadam";
		String w2="hellomadam";
		String w3="madam";
		Boolean r1=w1.equals(w2);
		System.out.println(r1);
		Boolean r2=w1.equalsIgnoreCase(w2);
		System.out.println(r2);
		boolean r3=w1.contains(w3);
		System.out.println(r3);
		boolean r4=w2.contains(w3);
		System.out.println(r4);
		
		
		//String seperation
		String raj="Nithin raj";
		char a1=raj.charAt(0);
		char a2=raj.charAt(2);
		char a3=raj.charAt(6);
		char a4=raj.charAt(8);
		System.out.println(a1+" "+a2+""+a3+" "+a4);
		
		for (int i = 0; i < raj.length(); i++) 
		{
			System.out.println(raj.charAt(i));
		}
		
		char[] chararray=raj.toCharArray();
		System.out.println(chararray);
		
		System.out.println("***********************************");
		
		String raj2="My name is Nithin from chennai";
		String[] sew=raj2.split(" ");
		
		for (int i = 0; i < sew.length; i++) {
			System.out.println(sew[i]);
		}
		
		System.out.println("***********************************");
		
		
		String raj3="I am a Software test engineer";
		String rd=raj3.substring(3);
		System.out.println(rd);
		String rd1=raj3.substring(3,12);
		System.out.println(rd1);
		
		
		
		
		
				
	}
}
