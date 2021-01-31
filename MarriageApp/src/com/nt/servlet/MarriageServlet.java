package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException ,IOException
	{
	PrintWriter pw=null;
	pw=res.getWriter();
	res.setContentType("text/html");
	
	String name=req.getParameter("uname");
	String page=req.getParameter("age");
	
	int age=Integer.parseInt(page);
	
	
	if(age<=18)
	{
		pw.println("<h1>not eligible to marriage</h1>");
	}
	else
	{
	pw.println("<h1>eligible to marriage</h1>");
	}
	pw.close();
	}	
	}
	
