package com.myJdbcCrud;

import java.sql.*;

public class MyFetch1 {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ab?user=root&password=admin");
 ps=con.prepareStatement("select * from register");
	rs=ps.executeQuery();
	while(rs.next()) {
		
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("email"));
		System.out.println(rs.getString("password"));
		System.out.println(rs.getString("gender"));
		System.out.println(rs.getString("city"));
		System.out.println("--".repeat(12));
	}
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	finally {
		try {
			con.close();
			ps.close();
			rs.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
}
}
