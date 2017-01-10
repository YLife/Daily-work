package cons;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.Data;
import entity.Users;

public class PageServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int pageSize = 3;
		int pageNum =1;
		String pageNumStr = request.getParameter("pageNum");
		try {
			pageNum = Integer.parseInt(pageNumStr);
		} catch (Exception e) {
			pageNum =1;
		}
		// 一共分多少页
		int sum =db.Data.getPageCount(pageSize);
		List<Users> list  = Data.getUsersByPageNum(pageNum, pageSize);
		
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("sum", sum);
		request.setAttribute("list", list);
				
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
