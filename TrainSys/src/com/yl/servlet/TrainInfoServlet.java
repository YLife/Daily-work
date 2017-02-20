package com.yl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.TrainInfoBiz;
import com.yl.biz.impl.TrainInfoBizImpl;
import com.yl.entity.TrainInfo;
import com.yl.vo.TrainInfoVo;

public class TrainInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TrainInfoBiz biz = new TrainInfoBizImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String currentPage = request.getParameter("currentPage");
		String pageSize = request.getParameter("pageSize");
		int page = currentPage != null ? Integer.parseInt(currentPage) : 1;
		int size = pageSize != null ? Integer.parseInt(pageSize) : 5;
		String type = request.getParameter("type");
		String begin = request.getParameter("begin");
		String end = request.getParameter("end");
		TrainInfoVo vo = new TrainInfoVo();
		if (type != null && !"".equals(type)) {
			vo.setType(Integer.parseInt(type));
		}
		if (begin != null && !"".equals(begin)) {
			vo.setBegin(begin);
		}
		if (end != null && !"".equals(end)) {
			vo.setEnd(end);
		}
		List<TrainInfo> list = biz.findAll(page, size, vo);
		int totalPage = biz.getTotalPage(size, vo);
		request.setAttribute("list", list);
		request.setAttribute("pageSize", size);
		request.setAttribute("currentPage", page);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("type", type);
		request.setAttribute("begin", begin);
		request.setAttribute("end", end);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
