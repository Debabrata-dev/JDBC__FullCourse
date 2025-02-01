package com.myJdbcCrud;

import java.sql.*;

public class MyDelete {
public static void main(String[] args) {
	String city="pune";
	Connection con=null;
	PreparedStatement ps=null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ab?user=root&password=admin");
		ps=con.prepareStatement("delete from register where email=?");
		ps.setString(1, city);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
}
