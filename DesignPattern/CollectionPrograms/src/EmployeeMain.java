import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.lang.*;
import java.util.Scanner;

public class EmployeeMain  {
	public static void main(String []args) {
		List<Employee> lr = new ArrayList<Employee>();
		lr.add(new Employee(122,"Avinash Arade",12000.0f,"Manager"));
		lr.add(new Employee(121,"Vinod Joshi",13000.0f,"Testor"));
		lr.add(new Employee(133,"Tushar Sutale",14000.0f,"Hr"));
		lr.add(new Employee(111,"Avinash Kargal",15000.0f,"Testor"));
		lr.add(new Employee(112,"Nilesh Sapkale",16000.0f,"Hr"));
		lr.add(new Employee(113,"Ganesh Thorat",15000.0f,"Manager"));
		lr.add(new Employee(114,"Akshay Ghugre",17000.0f,"Testor"));
		lr.add(new Employee(115,"Kaiwalya Vaidya",18000.0f,"Hr"));
		lr.add(new Employee(118,"Kaiwalya Vaidya",13000.0f,"Testor"));
		lr.add(new Employee(119,"Kaiwalya Vaidya",18000.0f,"Hr"));
		System.out.println("=========The Employee List are==========\n");
		for(int i=0;i<lr.size();i++) {
			System.out.println(lr.get(i));
		}
		
		System.out.println("=========The Employee List By Id sort==========\n");
		Iterator<Employee> ir = lr.iterator();
		Collections.sort(lr,Comparator.comparingInt(Employee::getEid));
		ir= lr.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println("=========The Employee List By Name==========\n");
		Collections.sort(lr,Comparator.comparing(Employee::getEname));
		ir= lr.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println("=========The Employee List By Salary==========\n");
		Collections.sort(lr,Comparator.comparing(Employee::getSalary));
		ir= lr.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		}
		
			
	
	}

