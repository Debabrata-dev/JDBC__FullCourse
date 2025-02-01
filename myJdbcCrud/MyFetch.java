package com.myJdbcCrud;


import java.sql.*;

public class MyFetch {
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
    	String name1=rs.getString("name");
    	System.out.println(name1);
    	String email1=rs.getString("email");
    	System.out.println(email1);
    	String password=rs.getString("password");
    	System.out.println(password);
    	String gender=rs.getString("gender");
    	System.out.println(gender);
    	String city=rs.getString("city");
    	System.out.println(city);
    	System.out.println("---".repeat(10));
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
