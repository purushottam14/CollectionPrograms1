import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.size());
		al.remove(1);//here 1 is index
		System.out.println("After removing element :"+al);
		
		//insert new element
		//add(index,object)
		al.add(2,"Python");
		System.out.println("After insertion"+ al);
		
		//retrive specific element
		System.out.println(al.get(2));
		
		//chnage and replace element
		al.set(2, "c#");
		System.out.println("After replacing :"+al);
		
		//for loop
		System.out.println("Reading the elements from arraylist");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//for each loop 
		System.out.println("===============================");
		System.out.println("reading elements using foreach");
		for(Object i:al) {
			System.out.println(i);
			
		//using iterator
			System.out.println("Reading using iterator");
		Iterator itr= al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		}
	
	}

}
