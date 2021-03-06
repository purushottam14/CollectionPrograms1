package com.comparator.example;

import java.util.ArrayList;
import java.util.Collections;
public class EmployeeRecords {
	int employee_Id;
	String employee_Name;
	float employee_salary;
	public EmployeeRecords(int employee_Id, String employee_Name, float employee_salary) {
		super();
		this.employee_Id = employee_Id;
		this.employee_Name = employee_Name;
		this.employee_salary = employee_salary;
	}
	public int getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public float getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(float employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	public String toString() {
		return "Employee [Employee_ID :"+this.employee_Id+" ,Employee_Name :"+this.employee_Name+" ,Employee_Salary :"+this.employee_salary +"]";
	}
}
	
	

