package com.yl.servlet;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.EmpBiz;
import com.yl.biz.impl.EmpBizImpl;
import com.yl.entity.Emp;

@WebServlet(urlPatterns="/emp.action")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpBiz eb = new EmpBizImpl();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer pageSize = 5;
		Integer page = 1;
		try {
			page = Integer.valueOf(request.getParameter("currentPage"));
		} catch (Exception e) {
			page = 1;
		}
		
		List<Emp> list = eb.querryByPage(page, pageSize);
		Integer totalPage = eb.getTotalPage(pageSize);
		
		request.setAttribute("currentPage", page);
		request.setAttribute("list", list);
		request.setAttribute("totalPage", totalPage);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
}
