package com.green.wishapp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
public class WishMessage extends GenericServlet{

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw=null;
		res.setContentType("text/html");
		pw=res.getWriter();
		
		String name=req.getParameter("wishmsg");
		
		pw.print("<h1>"+(name+name)+"</h1>");
		 
		pw.close();
		
	}

	public void service(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException
	{
		
		PrintWriter pw=null;
		res.setContentType("text/html");
		pw=res.getWriter();
		
		String name=req.getParameter("wishmsg");
		
		pw.print("<h1>"+name+"</h1>");
		 
		pw.close();
		
		
		
	}
}
