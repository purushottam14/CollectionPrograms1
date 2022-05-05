//Program to check given value is avialable or not
	package com.collection;
	import java.util.*;
public class CheckValueInArrayList {

	



		public static void main(String[] args) {
			ArrayList al= new ArrayList();
			
			al.add(101);
			al.add(102);
			al.add("tushar");
			al.add('A');
			al.add(14.60);
			
			System.out.println("This is list :"+al);
			if(al.contains('A')) {
				System.out.println("This value  'A' present in Arraylist");
			}
			else {
				System.out.println("This is not present ");
			}
			
		}

	

}
