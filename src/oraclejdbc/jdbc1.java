package oraclejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc1 {
	
	static  Connection conn=getcon();
	  static Connection getcon()  {
		  String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	        String user = "system"; 
	        String password = "7403"; 
		  
          Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  return conn;
	  }
	  public  void showdata() throws SQLException {
		  String sql = "select * from employee ";

          PreparedStatement pstmt = conn.prepareStatement(sql);
          ResultSet rs=pstmt.executeQuery();
          
          System.out.println("Empoyee Data  ");
          System.out.println("id  fname lname salary");

          while(rs.next()) {
              System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));
 
          }
         
          
	  }
	  public void  insertdata(Employee e) throws Exception {
		  
		  String query = "INSERT INTO employee VALUES (?, ?, ?,?,?) ";

          PreparedStatement ps = conn.prepareStatement(query);
           ps.setInt(1, e.getEmplId());
           ps.setString(2, e.getFname());
           ps.setString(3, e.getLname());
           ps.setInt(4, e.getSalary());	
           ps.setInt(5, e.getDeptid());
          int  status=   ps.executeUpdate();
          if (status > 0) {
              System.out.println("Record inserted successfully!");
          }else
          {
              System.out.println("Record  Not inserted !");

          }
          
	  }
	  
	  public void updateemployee(String newvalue,int id ,String cname) throws SQLException
	  {
		  String query = "update employee set "+cname+" = '"+newvalue+"' where eid = "+id;

          PreparedStatement ps = conn.prepareStatement(query);
          int rowsupdate = ps.executeUpdate();
          

          if (rowsupdate > 0) {
              System.out.println("Record Update successfully!");
          }else
          {
              System.out.println("Record  Not Update !");

          }
          
		  
		  
	  }
	  
	  public void updateemployee(int newvalue,int id ,String cname) throws SQLException
	  {
		  String query = "update employee set "+cname+" = "+newvalue+" where eid = "+id;

          PreparedStatement ps = conn.prepareStatement(query);
          int rowsupdate = ps.executeUpdate();
          

          if (rowsupdate > 0) {
              System.out.println("Record Update successfully!");
          }else
          {
              System.out.println("Record  Not Update !");

          }
          
		  
		  
	  }
	  
	  
 public void  deleteemployee(Employee e) throws Exception {
		  
		  String query = "delete employee where eid=? ";

          PreparedStatement ps = conn.prepareStatement(query);
           ps.setInt(1, e.getEmplId());
           
          int  status=   ps.executeUpdate();
          if (status > 0) {
              System.out.println("Record Delete successfully!");
          }else
          {
              System.out.println("Record  Not Delete !");

          }
          
	  }
}
