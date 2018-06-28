package org.skietapp.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Mvc01")
public class Mvc01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String strEur = request.getParameter("eur");
		try {
			double eur = Double.parseDouble(strEur);
			double pln = 4.2*eur;
			request.setAttribute("pln", pln);
			getServletContext().getRequestDispatcher("/view/jspMvc01.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			response.getWriter().append("Wrong parameter value");
		} catch (NullPointerException e) {
			response.getWriter().append("Parameter does not exist");
		}
	}
}
