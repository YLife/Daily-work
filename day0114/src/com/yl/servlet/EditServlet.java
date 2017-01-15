package com.yl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.EmpBiz;
import com.yl.biz.impl.EmpBizImpl;
import com.yl.entity.Emp;

@WebServlet(urlPatterns="/edit.action")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpBiz eb = new EmpBizImpl();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String empno = request.getParameter("empno");
		Emp emp = eb.querryById(Integer.valueOf(empno));
		request.setAttribute("emp", emp);
		request.getRequestDispatcher("edit.jsp").forward(request, response);
	}
}
