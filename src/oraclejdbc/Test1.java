package oraclejdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Test1 {
	
	
	
	public void insertemployee(jdbc1 j) throws Exception {
        Scanner sc = new Scanner(System.in);

        Employee employee =new Employee ();
		System.out.println(" Enter Id ");
		employee.setEmplId(sc.nextInt());
        System.out.println(" Enter First Name");
        employee.setFname(sc.next());
        System.out.println(" Enter Last Name");
        employee.setLname(sc.next());
        System.out.println(" Enter Salary");
        employee.setSalary(sc.nextInt());
        System.out.println(" Enter Department ID");
        employee.setDeptid(sc.nextInt());
       
        j.insertdata(employee);
        
	}
	
	public void update(jdbc1 j) throws Exception {
		
		
		
		        Scanner sc = new Scanner(System.in);
		        String nfname = "", nlname = "",columnName="";
		        int nsalary = 0;
		        int deptid = 0,empid=0;

		        while (true) {
		            System.out.println("\nChoose an option:");
		            System.out.println("1. Enter First Name");
		            System.out.println("2. Enter Last Name");
		            System.out.println("3. Enter Salary");
		            System.out.println("4. Enter Department ID");
		            System.out.println("5.Show All Data");
		            System.out.println("6. Exit");

		            System.out.print("Enter your choice: ");
		            
		            int choice = sc.nextInt();
		            sc.nextLine(); // Consume newline
		            
		            switch (choice) {
		                case 1:
		                	
		                    System.out.print("Enter First Name: ");
		                    
		                    nfname = sc.nextLine();
		                    System.out.print("Enter Emp  id: ");
		                   empid= sc.nextInt();

		                    columnName="fname";
		                    j.updateemployee(nfname, empid, columnName);
		                    //updateemployee(String newvalue,int id ,String cname)
		                    
		                    break;
		                case 2:
		                    System.out.print("Enter Last Name: ");
		                    nlname = sc.nextLine();
		                    
		                    System.out.print("Enter Emp  id: ");
			                   empid= sc.nextInt();
			                    columnName="lname";
			                    j.updateemployee(nlname, empid, columnName);
		                    
		                    break;
		                case 3:
		                    System.out.print("Enter Salary: ");
		                    nsalary = sc.nextInt();
		                    
		                    System.out.print("Enter Emp  id: ");
			                   empid= sc.nextInt();
			                    columnName="salary";
			                    j.updateemployee(nsalary, empid, columnName);
		                    
		                    
		                    break;
		                case 4:
		                    System.out.print("Enter Department ID: ");
		                    deptid = sc.nextInt();
		                    
		                    	System.out.print("Enter Emp  id: ");
			                   empid= sc.nextInt();
			                    columnName="depid";
			                    j.updateemployee(deptid, empid, columnName);
		                    
		                    
		                    break;
		                case 5:
		                	j.showdata();
		                	
		                	   break;
		                case 6:
		                    
		                    System.out.println("Exiting...");
		                    sc.close();
		                    return;
		                default:
		                    System.out.println("Invalid choice! Please select a valid option.");
		            }
		        }
		   

		
	}
	

	public static void main(String[] args) {
		jdbc1 j=new jdbc1();
		//Employee  emp1=new Employee(8,"Ketan","Joshi",50000,30);
		Test1 t=new Test1();
		
        //t.insertemployee(j);
		
		
		
		
		
		
		
		
	}

}
