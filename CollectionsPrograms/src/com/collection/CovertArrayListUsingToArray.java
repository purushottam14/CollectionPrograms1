//Program to covert the arraylist to array using ToArray();

		package com.collection;
		import java.util.*;
public class CovertArrayListUsingToArray {
	

			public static void main(String[] args) {
				ArrayList<String>al= new ArrayList<>();
				
				al.add("Akshay");
				al.add("Deoraj");
				al.add("tushar");
				al.add("Amol");
				al.add("Vinod ");
				
				System.out.println(al);
				System.out.println("=================================");
				//ArrayList Convert using ToArray() 
				String [] arr =  al.toArray(new String[al.size()]);
				System.out.println("==========================");
				System.out.println("This is coverted array");
				for (int j=0;j<arr.length;j++) {
					System.out.println(arr[j]);
				}
				
}
}
