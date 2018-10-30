

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ResponseDemo1 extends HttpServlet {

/**text/html;charset=UTF-8
 * ��servlet����outputStream������ĵ�����
 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//����responseʹ�õ�����Կ���response��ʲô����������д������
		response.setCharacterEncoding("UTF-8");
		//ָ���������ʲô���򿪷��������͵�����
		response.setHeader("Content-Type","text/html;charset=UTF-8");
		String data = "�л����񹲺͹�";
		
		PrintWriter out = response.getWriter();
		out.write(data);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
