package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Test1");
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter x = response.getWriter();
		
		x.print("<html><body>");
		x.print("<h3>이게 뭐니</h3>");
		x.print("</body></html>");
		
		
		
	}

}
