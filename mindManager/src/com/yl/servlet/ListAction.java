package com.yl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.MindBiz;
import com.yl.biz.impl.MindBizImpl;
import com.yl.entity.Mind;

public class ListAction extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private MindBiz mb = new MindBizImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		List<Mind> list = mb.findAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
