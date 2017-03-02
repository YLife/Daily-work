package com.yl.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.EmpBiz;
import com.yl.biz.impl.EmpBizImpl;
import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpBiz biz = new EmpBizImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String currentPage = request.getParameter("currentPage");
		String pageSize = request.getParameter("pageSize");
		Integer page = currentPage != null ? Integer.valueOf(currentPage) : 1;
		Integer size = pageSize != null ? Integer.valueOf(pageSize) : 5;
		String begin = request.getParameter("begin");
		String end = request.getParameter("end");
		String jumpPage = request.getParameter("jumpPage");
		if (jumpPage != null) {
			page = Integer.valueOf(jumpPage);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		EmpVo vo = new EmpVo();
		System.out.println(begin + "==================");
		if (begin != null && !"".equals(begin)) {
			try {
				vo.setBegin(sdf.parse(begin));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if (end != null && !"".equals(end)) {
			try {
				vo.setEnd(sdf.parse(end));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		List<Emp> list = biz.findList(page, size, vo);
		int totalPage = biz.getTotalPage(size, vo);
		Date date = new Date();
		request.setAttribute("list", list);
		request.setAttribute("currentPage", page);
		request.setAttribute("pageSize", size);
		request.setAttribute("jumpPage", jumpPage);
		request.setAttribute("begin", begin);
		request.setAttribute("end", end);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("date", date);
		request.getRequestDispatcher("emp.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
