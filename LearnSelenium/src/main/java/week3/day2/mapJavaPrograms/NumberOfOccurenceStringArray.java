package week3.day2.mapJavaPrograms;

import java.util.HashMap;

public class NumberOfOccurenceStringArray {
	
	public static void main(String[] args) {
		
		
		String[] name= {"And","ed","and","and","ee"};
		
		HashMap<String, Integer> occurs = new HashMap<String,Integer>();
		
		for (String ch : name) 
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
