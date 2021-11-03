package com.klef;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings({ "unused", "serial" })
public class FirstServlet extends HttpServlet 
{
	public  void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//out.println("i am in first servlet<br>");
		
		//RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
		//rd.forward(request, response);
		
		//RequestDispatcher rd1=request.getRequestDispatcher("SecondServlet");
		//rd1.include(request, response);
		
		
		//response.sendRedirect("SecondServlet");
		
		response.sendRedirect("https://www.kluniversity.in/");
		
		
	}

}
