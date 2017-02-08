package com.yl.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.MindBiz;
import com.yl.biz.impl.MindBizImpl;
import com.yl.entity.Mind;

public class EditAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MindBiz mb = new MindBizImpl();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date writeDate = null;
		try {
			writeDate = sdf.parse(request.getParameter("writeDate"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int row = mb.edit(new Mind(id, title, content, writeDate));
		if (row == 1) {
			response.sendRedirect("list.action");			
		}
	}

}
