package com.yl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.TrainInfoBiz;
import com.yl.biz.impl.TrainInfoBizImpl;

public class TrainInfoDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TrainInfoBiz biz = new TrainInfoBizImpl();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String mess[] = request.getParameterValues("trainNo");
		int row = 0;
		for (int i = 0; i < mess.length; i++) {
			row += biz.del(mess[i]);
		}
		
		if (row == mess.length) {
			response.getWriter().print("<script>alert('É¾³ý³É¹¦£¡');window.location.href='TrainInfoServlet';</script>");
		}
	}

}
