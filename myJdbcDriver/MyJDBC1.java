package com.myJdbcDriver;

import java.sql.*;

public class MyJDBC1 {
public static void main(String[] args) {
	String nam="varun";
	String email="varun@gmail.com";
	String password="7394";
	String gender="male";
	String city="LosAngelus";
	Connection con=null;
	 PreparedStatement ps=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ab?user=root&password=admin");
 ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
 ps.setString(1, nam);
 ps.setString(2, email);
 ps.setString(3, password);
 ps.setString(4, gender);
 ps.setString(5, city);
 int i=ps.executeUpdate();
 if(i>0) {
	 System.out.println("Suucess");
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
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	
}
}
}