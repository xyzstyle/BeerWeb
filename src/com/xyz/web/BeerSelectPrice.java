package com.xyz.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BeerSelectPrice extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4647092386035709627L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String price = req.getParameter("price");
		HttpSession session = req.getSession();
		String color = (String) session.getAttribute("color");
		
		BeerExpertAll beerExpect = new BeerExpertAll();
		List<String> result = beerExpect.getBrands(color,price);

		req.setAttribute("styles", result);
		RequestDispatcher view = req.getRequestDispatcher("result.jsp");
		view.forward(req, resp);

	}

}
