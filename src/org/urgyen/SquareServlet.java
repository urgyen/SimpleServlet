package org.urgyen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sqr")
public class SquareServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		int sum=0;
		
		Cookie cookie[]= request.getCookies();
		
		for(Cookie c: cookie) {
			if(c.getName().equals("sum"))
				sum= Integer.parseInt(c.getValue());
			//	sum=10;
		}
		
		
		//int sum= Integer.parseInt(request.getParameter("sum"));
		sum=sum*sum;
		PrintWriter write= response.getWriter();
		write.println("Square is : "+ sum);
		System.out.println("ok");
		
	}
	
}
