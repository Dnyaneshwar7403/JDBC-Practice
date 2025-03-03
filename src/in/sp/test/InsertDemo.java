package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) throws  SQLException, ClassNotFoundException 
	{
		//user get value
		Scanner sc = new Scanner(System.in);
	System.out.println("enter name");
      String name1=sc.next();
      
		System.out.println("enter email");
       String  email1=sc.next();
       
		System.out.println("enter pass");
		String pass1=sc.next();
		
		System.out.println("enter gender");
		String gender1=sc.next();
		
		System.out.println("enter city");
		String city1=sc.next();

		
		//Load and Register driver//
Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("Driver class loaded Successfully");
		
		//Create Connectionn//
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/rs","root","dell");
//	System.out.println("Success");
	
	//Create Statement//
	
	//PreparedStatement ps=   con.prepareStatement("insert into  register  values('Mauli','mauli@gmail.com','mauli123','male','pune' )");
	PreparedStatement ps =   con.prepareStatement("insert into  register  values(?,?,?,?,?)");
	ps.setString(1, name1);
	ps.setString(2,email1);
	ps.setString(3,pass1);
	ps.setString(4,gender1);
	ps.setString(5, city1);
	   int i= ps.executeUpdate();
	   if(i>0) {
		   
	   
	System.out.println("record insert success");
	   }
	   else {
			System.out.println("Fail");

	   }
	}

}
