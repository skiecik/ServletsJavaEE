package org.skietapp.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet22")
public class Servlet22 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String ip = request.getRemoteAddr();
		String browser = request.getHeader("User-Agent");
		Date date = new Date();
		
		response.getWriter().append(ip)
							.append("\n")
							.append(browser)
							.append("\n")
							.append(date.toString());
	}
}
