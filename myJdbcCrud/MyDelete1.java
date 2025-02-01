package com.myJdbcCrud;
import java.sql.*;
public class MyDelete1 {
public static void main(String[] args) {
	Connection con=null;
	 PreparedStatement ps=null;
	 String nam="varun";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ab?user=root&password=admin");
        ps=con.prepareStatement("delete from register where name=?");
        ps.setString(1, nam);
       int i =ps.executeUpdate();
       if(i>0) {
    	   System.out.println("Suucess full delete");
       }
       else {
    	   System.out.println("Failer success Fully");
       }
        
	} catch (ClassNotFoundException | SQLException e) {
	
		e.printStackTrace();
	}
	finally {
		
		try {
			ps.close();
			con.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
}
