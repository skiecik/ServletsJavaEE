package org.skietapp.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get1")
public class Get1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String start = request.getParameter("start");
		String end = request.getParameter("end");
		try {
			int s = Integer.parseInt(start);
			int e = Integer.parseInt(end);
			for (int i = s; i <= e; i++) {
				response.getWriter().append(String.valueOf(i));
			}
		} catch (NumberFormatException e) {
			response.getWriter().append("Wrong params values");
		}
	}

}
