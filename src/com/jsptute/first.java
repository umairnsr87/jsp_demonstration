package com.jsptute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class first extends HttpServlet{
/*	 @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 int i=Integer.parseInt(req.getParameter("num1"));
		 int j= Integer.parseInt(req.getParameter("num2"));
		 int k=i+j;
		 
		 
		 PrintWriter outPrintWriter=resp.getWriter();
		 outPrintWriter.print("The result is "+k);
		 //System.out.println();
		 
	}
	
	*/
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	

		 int i=Integer.parseInt(req.getParameter("num1"));
		 int j= Integer.parseInt(req.getParameter("num2"));
		 int k=i+j;
		 
		 
		 PrintWriter outPrintWriter=resp.getWriter();
		 outPrintWriter.print("The result is "+k);
		 //System.out.println();	

		 req.setAttribute("k", k);
		 //cookies
		 Cookie cookie=new Cookie("k", k+"");
		 resp.addCookie(cookie);
		 
		 
	//session
//		 HttpSession session=req.getSession();
//		 session.setAttribute("k",k);
		 resp.sendRedirect("sq");
//		 
//		 RequestDispatcher rdDispatcher=req.getRequestDispatcher("sq");
//		 rdDispatcher.forward(req, resp);
	}
	
/*	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	

		 int i=Integer.parseInt(req.getParameter("num1"));
		 int j= Integer.parseInt(req.getParameter("num2"));
		 int k=i+j;
		 
		 
		 PrintWriter outPrintWriter=resp.getWriter();
		 outPrintWriter.print("The result is "+k);
		 //System.out.println();	

		// TODO Auto-generated method stub
	}*/
}
