package My_Databases;


import java.sql.*;

public class MainProgram {
	
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	String qury="Insert into test.Study values(?,?,?)";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Rgisiter");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
	System.out.println("Coonection");
		ps=con.prepareStatement(qury);
		
	ps.setString(1, "Smith");
	ps.setString(2, "Smith@gamil.com");
	ps.setString(3, "AusCrick");
	ps.executeUpdate();
	
	ps.setString(1, "MSD");
	ps.setString(2, "Dhoni@gmail.com");
	ps.setString(3, "Captain");
	ps.executeUpdate();

	ps.setString(1, "Kane");
	ps.setString(2, "Will@gmail.com");
	ps.setString(3, "NZ CAP");
	ps.executeUpdate();

	ps.setString(1, "Virat");
	ps.setString(2, "Kholi@gmail.com");
	ps.setString(3, "King");
	ps.executeUpdate();
System.out.println("Excute Every Things");
	
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
}
