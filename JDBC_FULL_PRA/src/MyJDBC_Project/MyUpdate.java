package MyJDBC_Project;

import java.sql.*;

public class MyUpdate {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
	ps=con.prepareStatement("Update test.student set Sname=? where Sid=?");
	ps.setString(1, "Ram");
	ps.setInt(2, 1);
	ps.executeUpdate();
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
		
	}
}
