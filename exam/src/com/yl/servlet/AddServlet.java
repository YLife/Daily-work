package com.yl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.QuestionBiz;
import com.yl.biz.impl.QuestionBizImpl;
import com.yl.entity.Question;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private QuestionBiz biz = new QuestionBizImpl();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String question = request.getParameter("question");
		String option_a = request.getParameter("option_a");
		String option_b = request.getParameter("option_b");
		String option_c = request.getParameter("option_c");
		String option_d = request.getParameter("option_d");
		int subject = Integer.parseInt(request.getParameter("subject"));
		String answer = request.getParameter("answer");
		int row = biz.saveQuestion(new Question(0, question, option_a, option_b, option_c, option_d, subject, answer));
		if (row > 0) {
			out.print("<script>alert('试题添加成功,是否查询？');location.href='questions.action'</script>");
		}
	}

}
