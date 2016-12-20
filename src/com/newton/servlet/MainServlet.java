package com.newton.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newton.dto.Person;
import com.newton.servlet.abstracts.AbstractServlet;

public class MainServlet extends AbstractServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Check session
		checkValidSession(req, resp);
		
		List<Person> personList = new ArrayList<>();
		personList.add(Person.create(1, "pcj", "010-0000-1111"));
		personList.add(Person.create(2, "lsj", "010-0000-2222"));
		personList.add(Person.create(3, "aaa", "010-0000-3333"));
		
		req.setAttribute("personList", personList);
		
		// WebContent 가 Root 경로임.
		
		String viewFile = "/WEB-INF/main.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(viewFile);
		dispatcher.forward(req, resp);
	}
}
