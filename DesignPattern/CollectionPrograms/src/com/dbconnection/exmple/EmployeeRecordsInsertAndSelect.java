package com.dbconnection.exmple;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class EmployeeRecordsInsertAndSelect {
	public static void main(String []args) throws Exception{
		
		int employee_id;
		String employee_name;
		float employee_salary;
		String department;
		
		List<Employee> lr,lr2;
		lr = new ArrayList<Employee>();
		lr.add(new Employee(125," Arade",12000.0f,"Manager"));
		lr.add(new Employee(126," Joshi",13000.0f,"Testor"));
		lr.add(new Employee(136," Sutale",14000.0f,"Hr"));
		lr.add(new Employee(147,"Vishal l",15000.0f,"Testor"));
		lr.add(new Employee(145,"Ashish Sapkale",16000.0f,"Hr"));
		lr.add(new Employee(148,"Rhushi Thorat",15000.0f,"Manager"));
		lr.add(new Employee(156,"Damodhar Ghugre",17000.0f,"Testor"));
		lr.add(new Employee(157," Kiran Vaidya",18000.0f,"Hr"));
		lr.add(new Employee(164,"Xamp Error",13000.0f,"Testor"));
		lr.add(new Employee(163,"Laxman ks",18000.0f,"Hr"));
		
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","puru1","puru123");
		Statement stmt=con.createStatement(); 
		for(Employee e : lr) {
			employee_id =e.getEid();
			employee_name=e.getEname();
			employee_salary=e.getSalary();
			department =e.getDept();
			stmt.addBatch("INSERT Into EmployeeRecord(E_Id,EName,Salary,Department) values("+employee_id +",'"+employee_name+"',"+employee_salary+",'"+department+"')");
		}
		int [] result = stmt.executeBatch();
		for(int i=0;i<result.length;i++) {
			if(result[i]==0) {
				break;
			}
		}
		if(result.length>0) {
			System.out.println(result.length+" Reccord Inserted Succesfully");
			
			System.out.println("=======EmployeeRecord Details ======\n");
			ResultSet rs = stmt.executeQuery("Select * from EmployeeRecord");
			lr2= new ArrayList<Employee>();
			while(rs.next()) {
				Employee e= new Employee();
				e.setEid(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDept(rs.getString(4));
				lr2.add(e);
			}
			for(Employee e :lr2) {
				System.out.println("\nEmployeeId :"+e.getEid());
				System.out.println("\nEmployee Name :"+e.getEname());
				System.out.println("\nEmployee Salary :"+e.getSalary());
				System.out.println("\nEmployee Department :"+e.getDept());
				System.out.println("==========================================\n");
			}
		}else {
			System.out.println("Record not Inserted unable to proceed");
		}
		
		
		
		}
}

