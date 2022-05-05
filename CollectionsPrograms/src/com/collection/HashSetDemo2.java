package com.collection;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> evenNumber =  new HashSet<Integer>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		 
		System.out.println("Hashset :"+evenNumber);
		//addall
		
		HashSet <Integer> numbers = new HashSet<Integer>();
		numbers.addAll(evenNumber);
		System.out.println(numbers);
		numbers.add(10);
		System.out.println("after adding element :"+numbers);
		System.out.println("=====================================");
		//union intersection difference
		HashSet <Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		System.out.println(set);
		HashSet <Integer> set2= new HashSet<Integer>();
		set2.add(2);set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println(set2);
		//unoion
		System.out.println("=====================");
		set.addAll(set2);
		System.out.println("Union :"+set);
		System.out.println("=======================");
		//Intersection
		set.retainAll(set2);
		System.out.println("Intersection :"+set);
		System.out.println("======================= ");
		//difference
		set.removeAll(set2);
		System.out.println("Difference :"+set);
	}

}
