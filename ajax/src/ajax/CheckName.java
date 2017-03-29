package ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String uname = request.getParameter("uname");
		System.out.println(uname);
		if (uname != null && !"".equals(uname)) {
			if (uname.equals("hello")) {
				response.getWriter().print("该名称已被使用！");
			}else {
				response.getWriter().print("该昵称可以使用！");
			}
		}
	}

}
