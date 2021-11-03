package com.klef;
import java.io.*;
import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class InitContextParamsDemo extends HttpServlet 
{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("init parameter Demo<br>");
		
		ServletConfig config=getServletConfig();
		out.println(config.getInitParameter("id")+"<br>");//1290
		out.println(config.getInitParameter("name")+"<br>");//siva
		out.println(config.getInitParameter("gender")+"<br>");//male
		out.println(config.getInitParameter("designation")+"<br>");//null
		
		out.println("Context Parameter Demo<br>");
		
		ServletContext context=getServletContext();
		out.println(context.getInitParameter("dept")+"<br>");//cse
		out.println(context.getInitParameter("university")+"<br>");//klu
		
		out.println("Init parameters Demo using Enumeration<br>");
		
		ServletConfig sc=getServletConfig();
		Enumeration<String> initpara=sc.getInitParameterNames();
		
		while(initpara.hasMoreElements())
		{
			out.println(sc.getInitParameter(initpara.nextElement())+"<br>");
		}
		
		out.println("Context Parameter Demo using Enumeration<br>");
		
		ServletContext sc1=getServletContext();
		Enumeration<String> contextpara=sc1.getInitParameterNames();
		
		
		while(contextpara.hasMoreElements())
		{
			out.println(sc1.getInitParameter(contextpara.nextElement())+"<br>");
		}
	}

}
