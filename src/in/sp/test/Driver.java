package in.sp.test;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {

	

	    public static void main(String[] args) {
	        // Database connection details
	        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Change "xe" to your DB service name
	        String user = "system"; // Replace with your username
	        String password = "7403"; // Replace with your password

	        try {
	            // Load Oracle JDBC Driver (Optional for JDBC 4.0+)
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            // Establish Connection
	            Connection conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to Oracle Database successfully!");

	            // Close the connection
	            conn.close();
	        } catch (ClassNotFoundException e) {
	            System.out.println("Oracle JDBC Driver not found!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Connection failed!");
	            e.printStackTrace();
	        }
	    }
	}
