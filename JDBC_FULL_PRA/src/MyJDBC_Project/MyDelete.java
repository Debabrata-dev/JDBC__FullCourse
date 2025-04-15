package MyJDBC_Project;

import java.sql.*;

public class MyDelete {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
	ps=con.prepareStatement("delete from test.student where sid=?");
	ps.setInt(1, 8);
	ps.executeUpdate();
	ps.setInt(1, 7);
	ps.executeUpdate();
	ps.setInt(1, 6);
	ps.executeUpdate();
	System.out.println("Success full delete");
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally {
	if(ps!=null) {
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(con!=null) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	}

}
