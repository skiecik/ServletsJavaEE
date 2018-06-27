package org.skietapp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet23")
public class Servlet23 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String browser = request.getHeader("User-Agent");
		if (browser.contains("Chrome")) {
			response.getWriter().append("Google Chrome");
		} else if (browser.contains("Firefox")) {
			response.getWriter().append("Firefox");
		} else if (browser.contains("Opera")) {
			response.getWriter().append("Opera");
		} else if (browser.contains("Safari")) {
			response.getWriter().append("Safari");
		}
	}
}
