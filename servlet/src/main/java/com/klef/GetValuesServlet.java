package com.klef;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings({ "serial", "unused" })
public class GetValuesServlet extends HttpServlet
{
	
   public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
	   response.setContentType("text/html");
	   PrintWriter out=response.getWriter();
	   
	   String id=request.getParameter("eid");//id is the feid in the HTML form
	   String name=request.getParameter("ename");//name is the feild name in the HTML  form
	   
	   out.println("Employee ID number:"+id);
	   out.println("Employee Name:"+name);   
   }

}
