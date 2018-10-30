

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ResponseDemo1 extends HttpServlet {

/**text/html;charset=UTF-8
 * 在servlet中用outputStream输出中文的问题
 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//设置response使用的码表，以控制response以什么码表向浏览器写出数据
		response.setCharacterEncoding("UTF-8");
		//指定浏览器以什么码表打开服务器发送的数据
		response.setHeader("Content-Type","text/html;charset=UTF-8");
		String data = "中华人民共和国";
		
		PrintWriter out = response.getWriter();
		out.write(data);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
