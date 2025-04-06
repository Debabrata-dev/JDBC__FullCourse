package My_Databases;
import java.sql.*;
import java.util.Scanner;

public class Test1 {

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
	ps=con.prepareStatement("select UserName from test.study where Name=? && Email=?");
	ps.setString(1, Name);
	ps.setString(2, Email);
	rs=ps.executeQuery();
	if(rs.next()) {
		String Nam=rs.getString("UserName");
		System.out.println(Nam);
	}
	else {
		System.out.println("Not match");
	}
} catch (ClassNotFoundException | SQLException e) {
e.printStackTrace();
}
	}

}
