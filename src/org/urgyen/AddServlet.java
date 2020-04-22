package org.urgyen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		int sum = num1 + num2;
		
		Cookie cookie= new Cookie("sum", sum+ "");
		response.addCookie(cookie);
		
		
		response.sendRedirect("sqr");
		

//		System.out.println(sum);
//		
//		PrintWriter write= response.getWriter();
//		write.println("Sum is : "+ sum);
//		
//		RequestDispatcher rd= request.getRequestDispatcher("sqr");
//		rd.forward(request, response);
		
	}

}
