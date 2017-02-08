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

public class QuestionServlet extends HttpServlet {
	/**
	 *
	 *@param
	 */
	private static final long serialVersionUID = 1L;
	private QuestionBiz biz = new QuestionBizImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		List<Question> list = biz.findAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
