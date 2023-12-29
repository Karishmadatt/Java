package com.jsp.fetchformdata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DataCollector extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("un");
		String password = req.getParameter("password");
		
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		
		PrintWriter printWriter = res.getWriter();
		printWriter.print("Data fetched check console");

	}

}
