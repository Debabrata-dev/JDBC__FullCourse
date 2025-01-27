package com.jspider.fetch;

import java.sql.*;

public class MainFetch {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?user=root&password=admin");
		 ps=con.prepareStatement("select * from register");
		 rs=ps.executeQuery();
		while(rs.next()) {
			String name1=rs.getString("name");
			System.out.println(name1);
			System.out.println(rs.getString("email"));
			System.out.println("----".repeat(10));
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
