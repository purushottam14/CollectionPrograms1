import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		
		//sort the arraylist  from collections class collections.sort
		System.out.println("Elements before sorting :"+al);
		Collections.sort(al);
		
		System.out.println("After Sorting :"+al);
		
		//sorting arraylist in reverse order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("after sorting revse order : ");
		System.out.println(al);
		
	}
}
