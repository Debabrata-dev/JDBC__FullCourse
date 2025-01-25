package com.jspider.demo;
import java.sql.*;
public class Demo1 {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	String name="DonLee";
	String email="donlee@gamil.com";
	String pass="123";
	String gen="Male";
	String city="Kabul";
	try {
		Class.forName("com.mysql.jdbc.Driver");//load and register the driver
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?user=root&password=admin");//create aconnection
	    ps=con.prepareStatement("insert into register values('"+name+"','"+email+"','"+pass+"+','"+gen+"','"+city+"')");
	    int i=ps.executeUpdate();
	    if(i>0) {
	    	System.out.println("Succes");
	    }
	    else {
	    	System.out.println("Failled");
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
