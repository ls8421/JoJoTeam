package com.newton.servlet.abstracts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void checkValidSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Check session validation
		if (null == req.getParameter("session")) {
			String viewFile = "/WEB-INF/invalidSession.jsp";
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(viewFile);
			dispatcher.forward(req, resp);
		}
	}
}
