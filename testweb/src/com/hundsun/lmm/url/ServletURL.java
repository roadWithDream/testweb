package com.hundsun.lmm.url;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletURL
 */
@SuppressWarnings("serial")
public class ServletURL extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1、以/开头，若给服务器用，则/代表当前web应用。若给浏览器用，/代表网站
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
		//给网站用
		response.sendRedirect("/testweb/index.jsp");
		
		//
		this.getServletContext().getRealPath("/index.jsp");
		
		//
		this.getServletContext().getResourceAsStream("/index.jsp");
		
		//
		/**
		 * <a href = "/testweb/index.jsp">gg</a>
		 * 
		 * <form action = "/testweb/index.jsp">
		 * 
		 *  </form>
		 * 
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
