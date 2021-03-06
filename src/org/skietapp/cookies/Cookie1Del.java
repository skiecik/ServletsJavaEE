package org.skietapp.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteCookie")
public class Cookie1Del extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		try {
			for (Cookie c : cookies) {
				if (c.getName().equals("user")) {
					c.setMaxAge(0);
					response.addCookie(c);				}
			}
		} catch (NullPointerException e) {
			response.getWriter().append("Cookie does not exist");
		}
	}

}
