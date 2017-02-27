package com.yl.servlet;

import java.io.IOException;
import java.util.List;

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
import com.yl.vo.QuestionVo;

public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private QuestionBiz biz = new QuestionBizImpl();
	private SubjectBiz sbiz = new SubjectBizImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String currentPage = request.getParameter("currentPage");
		String pageSize = request.getParameter("pageSize");
		Integer page = currentPage != null ? Integer.valueOf(currentPage) : 1;
		Integer size = pageSize != null ? Integer.valueOf(pageSize) : 5;
		QuestionVo vo = new QuestionVo();
		String subjectId = request.getParameter("subjectId");
		if (subjectId != null && !"".equals(subjectId)) {
			vo.setSubjectId(Integer.valueOf(subjectId));
		}
		
		List<Question> list = biz.queryQuestions(page, size, vo);
		List<Subject> slist = sbiz.querySubjects();
		int totalPage = biz.getTotalPage(size, vo);
		request.setAttribute("currentPage", page);
		request.setAttribute("list", list);
		request.setAttribute("subjectId", subjectId);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("slist", slist);
		request.getRequestDispatcher("index.jsp").forward(request , response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
