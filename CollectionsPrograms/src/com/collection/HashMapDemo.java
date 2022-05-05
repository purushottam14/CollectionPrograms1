package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap hm = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101,"Tushar");
		hm.put(102, "Durgesh");
		hm.put(103, "Ganesh");
		hm.put(104, "Shubham");
		hm.put(104, "Ashok");//Duplicate keys not allowed if you try to used duplicate key then old key value will replaced with new key value.
		
		System.out.println(hm);
		
		System.out.println("============================");
		HashMap hm1 = new HashMap();
		hm1.putAll(hm);
		System.out.println("After using putAll() Mehtod");
		System.out.println(hm1);
		
		System.out.println("===========================");
		System.out.println(hm.size());//return the number of key values  are present in map
		
		System.out.println("==============================");
		System.out.println(hm.keySet());//return all the keys from map as set [101, 102, 103, 104]
		
		System.out.println("===========================");
		System.out.println(hm.values());//return the all values  as collection [Tushar, Durgesh, Ganesh, Ashok]
		
		System.out.println("=================================");
		System.out.println(hm.entrySet());//return the all entries from map along with key and value pair [101=Tushar, 102=Durgesh, 103=Ganesh, 104=Ashok]
		
		System.out.println("==================================");
		System.out.println("Get all the keys one by one :\n");
		for(Object i:hm.keySet()) {
			
			System.out.println(i);
		}
		
		System.out.println("=====================");
		System.out.println("Get all the values one by one:");
		for(Object i:hm.values()) {
			System.out.println(i);
		}
		
		System.out.println("==================================");
		System.out.println("Get as key value pair combinations :");
		for(Object i:hm.keySet()) {
			System.out.println(i+" "+hm.get(i));
			
		}
		System.out.println("=========================");
		//Entry interface methods
		for(Map.Entry i:hm.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		System.out.println("==============================");
		//iterartor ()
		Set  s=hm.entrySet();
		Iterator itr =s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry =  (Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
