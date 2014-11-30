package com.xyz.web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class BeerSelectColor extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2415311280433017284L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String color=req.getParameter("color");
		BeerBean beerBean=new BeerBean();
		beerBean.setColor(color);
		HttpSession session=req.getSession();
		session.setAttribute("beerBean",beerBean);
		resp.sendRedirect("session1.html");
		
		
	}
	

}
