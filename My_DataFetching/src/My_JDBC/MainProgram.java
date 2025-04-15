package My_JDBC;

import java.sql.*;
import java.util.Scanner;


public class MainProgram {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Name");
		String Name=s1.nextLine();
		System.out.println("Enter Email");
		String Email=s1.nextLine();
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
	ps=con.prepareStatement("select UserName from test.study where Name=? && Email=?");
	ps.setString(1, Name);
	ps.setString(2, Email);
	rs=ps.executeQuery();
	if(rs.next()) {
		String name=rs.getString(1);
		System.out.println(name);
//		String name=rs.getString("UserName");
//		System.out.println(name);
	}
	else {
		System.out.println("Not Found");
	}
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
finally {
	if(rs!=null) {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
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
