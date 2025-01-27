package com.jspider.demo;

import java.sql.*;

public class Sample {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	String name="Tom Hank";
	String email="tom@gmail.com";
	String password="balebale";
	String gender="male";
	String city="England";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?user=root&password=admin");
		 ps=con.prepareStatement("Insert into register values(?,?,?,?,?)");
		 ps.setString(1, name);
		 ps.setString(2, email);
		 ps.setString(3, password);
		 ps.setString(4, gender);
		 ps.setString(5, city);
		 int i=ps.executeUpdate();
		 if(i>0) {
			 System.out.println("Suucess");
		 }
		 else {
			 System.out.println("failed");
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
