package com.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashtable ht = new Hashtable(); // capacity is 11 , load factor 0.75
		
		//Hashtable t=new Hashtable(initial capacity);//create hashtable object with some capacity
		//Hashtable t= new Hashtable (Initial capacity,fill ratio/load factor);
		Hashtable <Integer ,String> ht = new Hashtable<Integer, String>();
		ht.put(11, "Tushar");
		ht.put(12, "Smith");
		ht.put(13, "Durgesh");
		ht.put(14, "Devika");
		// ht.put(null, "x");// it return NullPointerException null not allowed as key and values
		
		System.out.println(ht);
		
		ht.remove(14);
		System.out.println("After removing element :"+ht);
		
		System.out.println("Is the empty hashtable :"+ht.isEmpty());
		
		System.out.println("only keyset :"+ht.keySet());
		System.out.println("=========================");
		System.out.println("all values return as collection :"+ht.values());
		
		System.out.println("=================================");
		for(int k:ht.keySet()) {
			System.out.println(k +"   "+ht.get(k));
			
			}
		System.out.println("============================");
		//By using Iterator iterate
		Set s= ht.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
