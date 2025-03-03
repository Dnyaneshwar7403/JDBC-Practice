package oraclejdbc;

public class Employee {
	private int emplId;
     private  String fname;
     private String lname;
     private int salary;   
     private int deptid;
	public int getEmplId() {
		return emplId;
	}
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary
				+ ", deptid=" + deptid + "]";
	}
	public Employee(int emplId, String fname, String lname, int salary, int deptid) {
		super();
		this.emplId = emplId;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.deptid = deptid;
	}
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}


	

}
