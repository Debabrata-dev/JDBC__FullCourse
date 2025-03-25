package org.jsp.JDBC_App;
import java.sql.*;

public class MainProgram {
public static void main(String[] args) {
	Connection con=null;
	Statement stm=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");//1
		System.out.println("Loaded");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");//2
       System.out.println("create connection");
		stm=con.createStatement();//3
        System.out.println("Platfrom is created");
        stm.executeUpdate("insert into test.student values(1,'Captain',64.8,123445)");//4
        System.out.println("Record is inserted");
        
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	
	finally {
		if(stm!=null) {
			try {
				stm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	}

}
