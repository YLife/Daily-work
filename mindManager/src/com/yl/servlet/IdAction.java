package com.yl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.MindBiz;
import com.yl.biz.impl.MindBizImpl;
import com.yl.entity.Mind;

public class IdAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MindBiz mb = new MindBizImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		Mind entity = mb.findById(id);
		request.setAttribute("entity", entity);
		request.getRequestDispatcher("edit.jsp").forward(request, response);
	}

}
