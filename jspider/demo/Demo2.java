package com.jspider.demo;
import java.sql.*;
public class Demo2 {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	String name="JhonWick";
	String email="Jhon@gamil.com";
	String pass="666";
	String gen="Male";
	String city="Byelorussian";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?user=root&password=admin");//create aconnection
		ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, pass);
		ps.setString(4,gen);
		ps.setString(5, city);
		
	    int i=ps.executeUpdate();
	    
	    if(i>0) {
	    	System.out.println("Succeess");
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
