package com.klef;
import java.io.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DemoServlet1 extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("Init parameter Demo<br>");
		
		ServletConfig config=getServletConfig();
		out.println(config.getInitParameter("id")+"<br>");//1290
		out.println(config.getInitParameter("name")+"<br>");//siva
		out.println(config.getInitParameter("gender")+"<br>");//male
		out.println(config.getInitParameter("designation")+"<br>");//professer
		
		out.println("context parameter demo<br>");
		
		ServletContext context=getServletContext();
		out.println(context.getInitParameter("dept")+"<br>");//cse
		out.println(context.getInitParameter("university")+"<br>");//klu
	}
}
