package com.yl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.QuestionBiz;
import com.yl.biz.SubjectBiz;
import com.yl.biz.impl.QuestionBizImpl;
import com.yl.biz.impl.SubjectBizImpl;
import com.yl.entity.Question;
import com.yl.entity.Subject;

public class DoQuestionAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private QuestionBiz biz= new QuestionBizImpl();
	private SubjectBiz sbiz = new SubjectBizImpl();
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
		Integer subjectId = Integer.valueOf(request.getParameter("subjectId"));
		String answer = request.getParameter("answer");
		Subject subject = sbiz.queryById(subjectId);
		Question questions = new Question(null, question, option_a, option_b, option_c, option_d, subject, answer);
		try {
			biz.saveOrUpdateQuestion(questions);
			out.print("<script>confirm('试题添加成功,是否查询？');location.href='QuestionServlet'</script>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
