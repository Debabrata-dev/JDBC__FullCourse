package com.myJdbcDriver;

import java.sql.*;

public class MyJdbcUpdate {
public static void main(String[] args) {
	Connection con=null;
	 PreparedStatement ps=null;
	 String nam="Sampl";
	 String email="Sampl@gmail";
	 String pass="@1234";
	 String gend="male";
	 String city="salfra";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ab?user=root&password=admin");
       ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
       ps.setString(1, nam);
       ps.setString(2, email);
       ps.setString(3, pass);
       ps.setString(4, gend);
       ps.setString(5, city);
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
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	
}
}}
