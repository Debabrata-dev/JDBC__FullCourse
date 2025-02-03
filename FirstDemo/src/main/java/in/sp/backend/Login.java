package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
   @Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	System.out.println("i am service method.....");
}
}
