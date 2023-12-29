package com.jsp.dopost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FetchData extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("un");
		String password = req.getParameter("pws");
		
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html><body>");
		writer.print(username);
		writer.print(password);
		writer.print("</body></html>");
	}
}
