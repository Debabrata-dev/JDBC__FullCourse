package com.jspider.demo;

import java.sql.*;

public class Demo3 {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	String name="Luck";
	String email="luck@gmail.com";
	String pass="12321";
	String gender="male";
	String city="England";
	try {
		Class.forName("com.mysql.jdbc.Driver");//load sqldriver
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?user=root&password=admin");
        //create connection
			ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, pass);
			ps.setString(4, gender);
			ps.setString(5, city);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("suucess");
			}
			else {
				System.out.println("Not");
			}
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	finally {
		try {
			con.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
