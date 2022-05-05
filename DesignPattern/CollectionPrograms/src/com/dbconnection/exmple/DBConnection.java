package com.dbconnection.exmple;
import java.sql.*;
import java.util.*;
public class DBConnection {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","puru1","puru123");
		Statement stmt=con.createStatement(); 
		System.out.println("======Enter the Choice======");
		System.out.println("1.Insert \n 2.RetriveDetails\n");
		int x= sc.nextInt();
		while(true){
				if (x==1) {
					int rs=stmt.executeUpdate("Insert into EmployeeRecord (E_id,Ename,Salary,Department)values(201,'Ganesh Bonde',12000,'HR')");  
					if(rs>0){  
						System.out.println("Record Inserted Succesfuly");  
					}
					else {
						System.out.println("Record is not inserted ");
			
					}
				}else if(x==2) {
					ResultSet rs=stmt.executeQuery("select * from EmployeeRecord");  
			  
					while(rs.next()){ 
						System.out.println("\n=====Employee Deatils=====\n");
						System.out.println("Employee Id :"+rs.getInt(1)+"\nEmployee Name : "+rs.getString(2)+"\nEmployee Salary :" +rs.getInt(3));  
					}  
			
				}
			
		}
			
	}
}


