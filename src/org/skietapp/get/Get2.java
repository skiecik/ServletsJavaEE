package org.skietapp.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get2")
public class Get2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = request.getParameter("page");
		if (!page.isEmpty() && !page.equals(null)) {
			response.getWriter().append("Parameter exists\n");
			int p = Integer.parseInt(page);
			for (int i = p; i > 0; i--) {
				if (p%i == 0) {
					response.getWriter().append(String.valueOf(i) + "\n");
				}
			}
		} else {
			response.getWriter().append("Parameter does not exist");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
