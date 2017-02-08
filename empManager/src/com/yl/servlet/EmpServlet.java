package com.yl.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.DeptBiz;
import com.yl.biz.EmpBiz;
import com.yl.biz.impl.DeptBizImpl;
import com.yl.biz.impl.EmpBizImpl;
import com.yl.entity.Dept;
import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpBiz biz = new EmpBizImpl();
	private DeptBiz db = new DeptBizImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset =utf-8");
		String currentPage = request.getParameter("currentPage");
		String pageSize = request.getParameter("pageSize");
		int page = currentPage != null ? Integer.parseInt(request.getParameter("currentPage")) : 1;
		int size = pageSize != null ? Integer.parseInt(request.getParameter("pageSize")) : 5;
		String ename = request.getParameter("ename");
		String deptno = request.getParameter("deptno");
		String begin = request.getParameter("begin");
		String end = request.getParameter("end");
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-mm-dd");
		EmpVo vo = new EmpVo();
		if (ename != null && !"".equals(ename)) {
			vo.setEname(ename);
		}
		if (deptno != null && !"".equals(deptno)) {
			vo.setDeptno(Integer.parseInt(deptno));
		}
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
		List<Emp> list = biz.findEmps(page, size, vo);
		int totalPage = biz.getTotalPage(vo , size);
		System.out.println(totalPage);
		List<Dept> dlist = db.findDepts();
		request.setAttribute("list", list);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("dlist", dlist);
		request.setAttribute("currentPage", page);
		request.setAttribute("ename", ename);
		request.setAttribute("deptno", deptno);
		request.setAttribute("begin", begin);
		request.setAttribute("end", end);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
