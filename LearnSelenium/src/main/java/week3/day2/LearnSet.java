package week3.day2;



import java.util.ArrayList;
import java.util.HashSet;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		
		set.add("Ajith");
		set.add("Bala");
		set.add("Sam");
		set.add("David");
		set.add("Franklin");
		set.add("James");
		set.add("David");
		
		System.out.println(set);
		
		Set<String> set1= new TreeSet<>();
		
		set1.add("Ajith");
		set1.add("Bala");
		set1.add("Sam");
		set1.add("David");
		set1.add("Franklin");
		set1.add("James");
		set1.add("David");
		
		System.out.println(set1);
		Set<String> set2= new LinkedHashSet<>();
		
		set2.add("Ajith");
		set2.add("Bala");
		set2.add("Sam");
		set2.add("David");
		set2.add("Franklin");
		set2.add("James");
		set2.add("David");
		System.out.println(set2);
		
		//System.out.println(set);
		//System.out.println(set1);
		//System.out.println(set2);
		
		for(String eachValue:set)
		{
			System.out.println(eachValue);
		}
		
		List<String> list1=new ArrayList<>();
		list1.addAll(set);
		System.out.println(list1);
		
		List<String> list2=new ArrayList<>(set);
		//list1.addAll(set);
		System.out.println(list2);
		
		for (int i = 0; i < list2.size(); i++) 
		{
			System.out.println(list2.get(i));
			
		}
	}
}
