package com.klef;
import java.io.*;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings({ "unused" })
public class MyThirdServlet implements Servlet
{
	ServletConfig config=null;
	public void init(ServletConfig config)
	{
		this.config=config;
		System.out.println("Servlet initalised");
	}
	
	public void service(ServletRequest request,ServletResponse response)throws IOException,ServletException
	{
		System.out.println("Service method");
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    
	    String name="klu";
	    out.println("<h1>Hello:"+name+"</h1><br>");//when ever you need a HTML tags put them in a double quotes
	    out.println("<h2>servlet life cycle implementing Servlet Interfaces class</h2>");
	    out.println(getServletInfo());
	    out.println("<br>");
	    out.println(getServletConfig());
	}
	
	public void destroy()
	{
		System.out.println("Destroy method");
	}

	
	public ServletConfig getServletConfig() 
	{
		
		return config;
	}

	
	public String getServletInfo() 
	{
		
		return "KLCSE:COPYRIGHT 2020";
	}	
}