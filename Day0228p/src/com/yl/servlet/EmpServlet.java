package com.yl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.EmpBiz;
import com.yl.biz.impl.EmpBizImpl;
import com.yl.entity.Emp;

public class EmpServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private EmpBiz biz = new EmpBizImpl(); 
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String currentPage = request.getParameter("currentPage");
		String pageSize = request.getParameter("pageSize");
		Integer page = currentPage != null ? Integer.valueOf(currentPage) : 1;
		Integer size = pageSize != null ? Integer.valueOf(pageSize) : 5;
		List<Emp> list = biz.queryEmps(page, size);
		request.setAttribute("currentPage", page);
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
