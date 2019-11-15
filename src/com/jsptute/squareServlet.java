package com.jsptute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class squareServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//HttpSession session=req.getSession();
		
		//as the get cookies method returns all teh cookies thats why we have to retreive from the array of cookies 
		Cookie cookies[]=	req.getCookies();
		int k=0;
		
		for(Cookie c:cookies)
		{
			if(c.getName().equals("k"))
			{
				k=Integer.parseInt(c.getValue());
			}
		}
		
		
//		int k=(int)session.getAttribute("k");
		
		
		
		
		k=k*k;
		
		PrintWriter outPrintWriter=resp.getWriter();
		outPrintWriter.print("result is"+k);
//		// TODO Auto-generated method stub
//	
		System.out.println("servlet called");
	}
	

}
