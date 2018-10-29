

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo extends HttpServlet {

/**text/html;charset=UTF-8
 * 在servlet中用outputStream输出中文的问题
 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//	response.setContentType("text/html;charset=UTF-8");
		
		response.setHeader("Content-Type","text/html;charset=UTF-8");
		String data = "{\"bizContent\": \"{\"interfaceHead\":{\"requestNo\":\"8c687ba0-41ca-4bb6-8dcc-849fd9e423f1\"},\"cancelPolicyReq\":{\"businessNo\":\"11651616165\"},\"responseCode\":\"0000\",\"responseMsg\":\"处理成功!\"}\"}";
		data = "<h1>hello world</h1>";
		OutputStream out = response.getOutputStream();
		out.write(data.getBytes("UTF-8"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
