//Program to iterate HashSet Using iterator and Foreachloop
package com.collection;
import java.util.*;

public class IterateHashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Tushar");
		hs.add("Narendra");
		hs.add("Ganesh");
		
		System.out.println(hs);
		System.out.println("=====================");
		//iterator
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===============================");
		//using foreach loop
		System.out.println("Using for loop :");
		for(Object i:hs) {
			System.out.println(i);
		}
		
		
		}

}
