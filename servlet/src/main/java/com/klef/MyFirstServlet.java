package com.klef;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyFirstServlet extends HttpServlet
{
	public void init()
	{
		System.out.println("Servlet initalised");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		System.out.println("Service method");
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    
	    String name="klu";
	    out.println("<h1>Hello:"+name+"</h1><br>");
	    out.println("<h2>servlet life cycle inherting Httpservlet class</h2>");
	    
		
	}
	
	public void destroy()
	{
		System.out.println("Destroy method");
	}
	
}