package com.yl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.TrainInfoBiz;
import com.yl.biz.impl.TrainInfoBizImpl;
import com.yl.entity.TrainInfo;

public class TrainInfoDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TrainInfoBiz biz = new TrainInfoBizImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String trainNo = request.getParameter("trainNo");
		TrainInfo trainInfo  = biz.findById(trainNo);
		request.setAttribute("trainInfo", trainInfo);
		request.getRequestDispatcher("trainInfoData.jsp").forward(request, response);
	}

}
