package com.collection;
import java.util.*;

public class SortMapByUsingArray {

	static Map<String, Integer> map = new HashMap<String, Integer>();
	public static void sortByKey()
	{
		ArrayList<String> sortbykey = new ArrayList<String>(map.keySet());
		
		Collections.sort(sortbykey);
		for(String x: sortbykey) {
			System.out.println("Key ="+x +" values ="+map.get(x));
		}
	}
	public static void main(String [] args) {
		map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);
        
        
        sortByKey();
        
        
   	}
}
