package com.yl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.QuestionBiz;
import com.yl.biz.impl.QuestionBizImpl;
import com.yl.entity.Question;

public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private QuestionBiz biz = new QuestionBizImpl();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		int subject = Integer.parseInt(request.getParameter("subject"));
		List<Question> list = biz.findBySubject(subject);
		request.setAttribute("list", list);
		request.setAttribute("subject", subject);
		request.getRequestDispatcher("index2.jsp").forward(request, response);
	}

}
