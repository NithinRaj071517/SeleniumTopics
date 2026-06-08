package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Nithin");
		list.add("Raj");
		list.add("NK");
		
		
		list.add("Nithu");
		list.add("Ram");
		list.add("Loki");
		list.add("NK");
		list.add(3,"Raghu");
		list.set(1, "Rj");
		System.out.println(list);
		
		int a =list.size();
		System.out.println(a);
		list.remove("Ram");
		System.out.println(list);
		int b =list.size();
		System.out.println(b);
		System.out.println("ifnfn");
		int index=list.indexOf("Loki");
		System.out.println(index);
		
		
		System.out.println(list.get(6));
		System.out.println("**********************");
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) 
		{
			String f=list.get(i);
			System.out.println(f);
		}
		
		System.out.println("*******************");
		
		boolean s=list.contains("NK");
		System.out.println(s);
		
		System.out.println("*******************");
		list.clear();
		boolean k=list.isEmpty();
		System.out.println(k);
		
		
	}
}
