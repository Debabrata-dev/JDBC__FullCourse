package My_Databases;
import java.sql.*;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String Name=s.nextLine();
		System.out.println("Enter Email");
		String Email=s.nextLine();
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
    ps=con.prepareStatement("select UserName from test.Study where Name=? && Email=?");
    ps.setString(1,Name);
    ps.setString(2, Email);
    rs=ps.executeQuery();
    if(rs.next()) {
    	String User=rs.getString(1);
    	System.out.println("User name is knig"+User);
    }
    else {
    	System.out.println("No match found");
    }
    
} catch (ClassNotFoundException | SQLException e) {
	
	e.printStackTrace();
}
finally {
	if(rs!=null) {
		try {
			rs.close();
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
