import java.util.Scanner;

public class Employee  {
	
	private int eid;
	private String ename;
	private float salary;
	private String dept;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(int eid, String ename, float salary, String dept) {
		
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
	}
		
	public String toString() {
		return "Employee["+this.eid+" ,"+this.ename+" ,"+this.salary+" ,"+this.dept+"]";
	}
	
		
}














