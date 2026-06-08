package week3.day2.mapJavaPrograms;

import java.util.HashMap;

public class NumberOfOccurenceInteger {
	
	public static void main(String[] args) {
		
		
		int[] name={1,9,7,88,76,88,54,66};
		
		HashMap<Integer, Integer> occurs = new HashMap<Integer,Integer>();
		
		for (int ch : name) 
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
