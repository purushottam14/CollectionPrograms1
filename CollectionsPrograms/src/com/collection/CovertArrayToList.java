package com.collection;
import java.util.*;



public class CovertArrayToList {

	public static void main(String[] args) {
	String [] arr = {"Tushar","Ganesh","Narendra","Anant","Error"};
	
	System.out.println("Array before convert :");
	for(String i:arr) {
		System.out.println(i);
	}
	System.out.println("=================================");
	///Covert array to list
	ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
	// Arrays.asList is appliacable only for String type list
//	 ArrayList<Integer> al=  new ArrayList<Integer>();
//	System.out.println(al);
//
//	System.out.println("Array After covert to list :");
//	for(Object i: al) {
//		
//	}
	
	

	}

}
