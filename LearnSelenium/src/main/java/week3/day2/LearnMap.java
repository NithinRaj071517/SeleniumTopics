package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {
	public static void main(String[] args) {
		Map<Integer, String> mapped=new HashMap<>(); 
		
		mapped.put(7007, "Akash");
		mapped.put(7003, "Kumar");
		mapped.put(7004, "Lokesh");
		mapped.put(7001, "Nithin");
		mapped.put(7002, "Raj");
		mapped.put(7005, "Sanjay");
		mapped.put(7006, "Bala");
		
		Map<Integer, String> mapped1=new TreeMap<>(); 
		
		mapped1.put(7007, "Akash");
		mapped1.put(7003, "Kumar");
		mapped1.put(7004, "Lokesh");
		mapped1.put(7001, "Nithin");
		mapped1.put(7002, "Raj");
		mapped1.put(7005, "Sanjay");
		mapped1.put(7006, "Bala");
		
		Map<Integer, String> mapped2=new LinkedHashMap<>(); 
		
		mapped2.put(7007, "Akash");
		mapped2.put(7003, "Kumar");
		mapped2.put(7004, "Lokesh");
		mapped2.put(7001, "Nithin");
		mapped2.put(7002, "Raj");
		mapped2.put(7005, "Sanjay");
		mapped2.put(7006, "Bala");
		mapped2.put(7002, "Ram");
		
		System.out.println(mapped);
		
		System.out.println(mapped1);
		
		System.out.println(mapped2);
		
		String string1=mapped2.get(7002);
		System.out.println(string1);
		System.out.println("****************************");
		Set<Entry<Integer,String>> entrySet1= mapped2.entrySet();
		for(Entry<Integer,String> eachEntry:entrySet1)
		{
			System.out.println(eachEntry.getValue());
			System.out.println(eachEntry.getKey());
			
		}
		
		
		System.out.println("****************************");
		
		Set<Integer> keys=mapped2.keySet();
		for(Integer eachKey:keys)
		{
			System.out.println(eachKey);
			System.out.println(mapped2.get(eachKey));
		}
		System.out.println("****************************");
		
		Boolean s=mapped.containsKey(7001);
		System.out.println(s);
		
		Boolean s1=mapped.containsValue("vif");
		System.out.println(s1);
		
	}

}
