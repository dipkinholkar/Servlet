package app.wish.wishmessage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WishMessage  extends GenericServlet{

	ServletConfig config=null;
	
	public void init(ServletConfig config)
	{
		
		this.config=config;
		
	}
	public void service(ServletRequest req , ServletResponse res) throws ServletException, IOException {
	
		res.setContentType("text/html");
		PrintWriter pw=null;
		pw=res.getWriter();
		String b=req.getParameter("birth");
		
		int dat=Integer.parseInt(b);

		pw.print(config);
			pw.close();		
	}
	
	public ServletConfig getConfig()
	{
		
		return config;
	}
	
	
}
