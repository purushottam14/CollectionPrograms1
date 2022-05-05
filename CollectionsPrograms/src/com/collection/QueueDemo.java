package com.collection;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue q= new PriorityQueue();
		//adding elements
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		
		q.offer("e");
		
		System.out.println(q);
		System.out.println("=================");
		System.out.println("using element :"+q.element());
	
		System.out.println("========================");
		System.out.println("Return remove the element :"+q.remove());
	
		//System.out.println(q);
	}

}
