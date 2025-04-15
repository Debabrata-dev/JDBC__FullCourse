package DataFeatch;

import java.sql.*;
import java.util.Scanner;

public class MainFetch {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter name");
		String name=s1.nextLine();
		System.out.println("Enter Email");
		String email=s1.nextLine();
		ResultSet rs=null;
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
	 ps=con.prepareStatement("select UserName from test.study where Name=? && Email=?");
	 ps.setString(1, name);
	 ps.setString(2, email);
	 rs=ps.executeQuery();
	 if(rs.next()) {
		 String username=rs.getString("UserName");
		 System.out.println("Welcome user "+username);
	 }
	 else {
		 System.err.println("Error");
	 }
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
	}

}
