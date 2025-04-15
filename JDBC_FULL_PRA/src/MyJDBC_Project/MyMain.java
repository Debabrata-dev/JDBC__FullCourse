package MyJDBC_Project;

import java.sql.*;

public class MyMain {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
    ps=con.prepareStatement("insert test.student values(?,?,?,?)");
    ps.setInt(1, 8);
    ps.setString(2, "Debabrata");
    ps.setDouble(3, 45.5);
    ps.setInt(4, 97786);
    ps.executeUpdate();
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
