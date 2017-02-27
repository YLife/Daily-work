package com.yl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.SubjectBiz;
import com.yl.biz.impl.SubjectBizImpl;
import com.yl.entity.Subject;

public class QuestionAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SubjectBiz biz= new SubjectBizImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Subject> list = biz.querySubjects();
		request.setAttribute("list", list);
		request.getRequestDispatcher("add.jsp").forward(request, response);
	}

}
