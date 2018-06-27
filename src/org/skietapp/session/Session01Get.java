package org.skietapp.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Session01Get")
public class Session01Get extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();
		try {
			int counter = (int) sess.getAttribute("counter") + 1;
			sess.setAttribute("counter", counter);
			response.getWriter().append("Counter = " + counter);
		} catch (NullPointerException e) {
			response.getWriter().append("No \"counter\" parameter");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
