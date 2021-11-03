package com.klef;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@SuppressWarnings("serial")
public class DemoServlet extends HttpServlet 
{
	
	
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		response.setContentType("text/html");
		System.out.println("Service method");
		PrintWriter out=response.getWriter();
		
		
		out.println("<h1>Welcome to Enterprise programming!</h1>");
		out.println("<h2>print the message using Httpservlet class</h2>");
		
	}
	
	
}
