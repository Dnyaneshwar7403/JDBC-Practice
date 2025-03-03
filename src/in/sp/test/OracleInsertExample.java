 package in.sp.test;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleInsertExample {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
        String user = "system"; 
        String password = "7403"; 
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Oracle Database!");

            String sql = "INSERT INTO employee (eid, fname, salary) VALUES (?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 98); 
            pstmt.setString(2, "ram"); 
            pstmt.setDouble(3, 688000); 

       int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Record inserted successfully!");
            }

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Oracle JDBC Driver not found!");
            e.printStackTrace();
        } 
    }
}
