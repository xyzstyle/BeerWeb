package com.xyz.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BeerSelect2 extends HttpServlet {

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
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("Beer Selection Advice<br>");
		String color=req.getParameter("color");
		//out.println("<br> Got beer color is:"+color);
		BeerExpert beerExpect=new BeerExpert();
		List<String> result=beerExpect.getBrands(color);
		Iterator<String> it=result.iterator();
		while(it.hasNext()){
			out.print("<br> try:  "+it.next());
		}
		
		
	}
	

}
