package com.hundsun.lmm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Request
 */
@SuppressWarnings("serial")
public class Request extends HttpServlet {

	/**
	 * 
	 */
	/**
	 * URI标识一个资源，URL标识互联网上的一个资源  
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println(request.getMethod());
		System.out.println(request.getHeader("HOST"));
		System.out.println(request.getHeader("Accept-Encoding"));
		
		System.out.println(request.getRequestURI());
		System.out.println(request.getRequestURL());
		System.out.println(request.getServerName());
		System.out.println(request.getProtocol());
		System.out.println(request.getContextPath());
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getRemotePort());
		System.out.println(request.getParameter("name"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
