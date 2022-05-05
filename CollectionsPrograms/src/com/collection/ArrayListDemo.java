//Program to traverse arraylist or iterate
package com.collection;
import java.util.*;


public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		al.add(101);
		al.add(102);
		al.add("tushar");
		al.add('A');
		al.add(14.60);
		
		//iterate arraylist using foreach
		System.out.println("Iterate ArrayList using foreach loop");
		for(Object i:al) {
			System.out.println(i);
		}
		
	}

}
