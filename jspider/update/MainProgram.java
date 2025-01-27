package com.jspider.update;

import java.sql.*;

public class MainProgram {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	String city1="Parish";
	String email1="tom@gmail.com";
  try {
	Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?user=root&password=admin");
     ps=con.prepareStatement("update register set city=? where email=?");
     
     ps.setString(1,city1);
     ps.setString(2,email1); 
     int i=ps.executeUpdate();
     if(i>0) {
    	 System.out.println("Updation Success");
     }
     else {
    	 System.out.println("Updation Failed");
     }
} 
  
  catch (ClassNotFoundException | SQLException e) {
	
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
