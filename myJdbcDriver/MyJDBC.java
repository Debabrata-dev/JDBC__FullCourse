package com.myJdbcDriver;

import java.sql.*;

public class MyJDBC {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	String name="Kamal";
	String email="kamal@gmail";
	String pass="DEMO12345";
	String gen="male";
	String city="California";
	try {
		Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ab?user=root&password=admin");	
	
	 ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
	 ps.setString(1, name);
	 ps.setString(2, email);
	 ps.setString(3, pass);
	 ps.setString(4, gen);
	 ps.setString(5, city);
	 int i=ps.executeUpdate();
	 if(i>0) {
		 System.out.println("Suucess Fully Created");
	 }
	 else {
		 System.out.println("Failed");
	 }
	 
	} 

	
	catch (ClassNotFoundException | SQLException e) {
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






//JDBC-JAVA DATABASES CONNCETIVTY

//JDBC api to connect java apliaction to databases

//load and register driver-->Class.forName("com.mysql.jdbc.Driver");
//Create connection --->DriverMangaet.getConction("url","username","password");
//Create statement-->create statemnet prepare statement con.prep
//Excute Sql querey -->ps.excuteQuery();
//process result -->ps.ExcuteUpadte();//insert,Update,delete querey
//close costly resoure 