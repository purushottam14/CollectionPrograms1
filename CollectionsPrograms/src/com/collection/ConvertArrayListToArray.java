//Program to covert the arraylist to array using 
	package com.collection;
	import java.util.*;

public class ConvertArrayListToArray {
	

		public static void main(String[] args) {
			ArrayList<String>al= new ArrayList<>();
			
			al.add("Akshay");
			al.add("Deoraj");
			al.add("tushar");
			al.add("Amol");
			al.add("Vinod ");
			
			System.out.println(al);
			//Array List to array conversion
			String [] arr= new String[al.size()];
			for(int i=0 ;i<al.size();i++) {
				arr[i]=al.get(i);
			}
			System.out.println("==========================");
			System.out.println("This is coverted array");
			for (int j=0;j<arr.length;j++) {
				System.out.println(arr[j]);
			}
			
		
		
			
			
//			//iterate arraylist using foreach
//			System.out.println("Iterate ArrayList using foreach loop");
//			for(Object i:al) {
//				System.out.println(i);
//			}
		
		}

	}


