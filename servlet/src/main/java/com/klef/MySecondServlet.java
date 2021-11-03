package com.klef;
import java.io.*;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings({ "serial", "unused" })
public class MySecondServlet extends GenericServlet
{
	public void init()
	{
		System.out.println("Servlet initalised");
	}
	
	public void service(ServletRequest request,ServletResponse response)throws IOException,ServletException
	{
		System.out.println("Service method");
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    
	    String name="klu";
	    out.println("<h1>Hello:"+name+"</h1><br>");
	    out.println("<h2>servlet life cycle inherting GeniricServlet class</h2>");
	    
		
	}
	
	public void destroy()
	{
		System.out.println("Destroy method");
	}
	
}