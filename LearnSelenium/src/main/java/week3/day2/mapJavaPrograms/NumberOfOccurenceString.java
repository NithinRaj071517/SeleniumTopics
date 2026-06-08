package week3.day2.mapJavaPrograms;

import java.util.HashMap;

public class NumberOfOccurenceString {
	
	public static void main(String[] args) {
		
		
		String name="Meedwwebshirbeie";
		
		HashMap<Character, Integer> occurs = new HashMap<Character,Integer>();
		
		for (char ch : name.toCharArray()) 
		{
			if(occurs.containsKey(ch))
			{
				int time=occurs.get(ch);
				occurs.put(ch,time+1);
			}
			
			else
			{
				occurs.put(ch, 1);
			}
		}
		System.out.println(occurs.entrySet());
	}

}
