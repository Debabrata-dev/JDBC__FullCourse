package com.jspider.demo;

import java.sql.*;



public class DemoJDBC {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
        try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?user=root&password=admin");//create aconnection
			System.out.println("Database connect");
	       ps= con.prepareStatement("insert into register values('Debabrata','ddas27790@gmail.com', '123a5', 'male','Odisha')");
           int i=ps.executeUpdate();
	       if(i>0) {
	    	   System.out.println("Success");
	       }
	       else {
	    	  System.err.println("Faild");
	       }
	       
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
        
        finally {
			try {
				con.close();
			} catch (SQLException e) {
			   e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
