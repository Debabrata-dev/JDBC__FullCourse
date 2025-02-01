package com.myJdbcCrud;

import java.sql.*;

public class MyUpdate {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	String city1="pune";

	String email1="Sampl@gmail";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		//load and register the driver
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ab?user=root&password=admin");
	ps=con.prepareStatement("update register set city=? where email=?");
	ps.setString(1, city1);
	ps.setString(2, email1);
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
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}
