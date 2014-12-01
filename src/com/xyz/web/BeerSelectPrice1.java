package com.xyz.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BeerSelectPrice1 extends HttpServlet {

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
		BeerBean beerBean = (BeerBean) session.getAttribute("beerBean");
		beerBean.setPrice(price);

		BeerExpertAll1 beerExpect = new BeerExpertAll1();
		List<String> result = beerExpect.getBrands(beerBean);

		req.setAttribute("styles", result);
		RequestDispatcher view = req.getRequestDispatcher("result.jsp");
		view.forward(req, resp);

	}

}
