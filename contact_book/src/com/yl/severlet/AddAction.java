package com.yl.severlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.entity.ContactBook;
import com.yl.impl.dao.ContactImpl;
import com.yl.interfaes.dao.ContactDao;

public class AddAction extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ContactDao cd = new ContactImpl();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String contactName = request.getParameter("contactName");
		String contactPhone = request.getParameter("contactPhone");
		String contactMail = request.getParameter("contactMail");
		String relation = request.getParameter("relation");
		ContactBook cb = new ContactBook(0, contactName, contactPhone, contactMail, relation);
		int row = cd.addConntact(cb);
		if (row > 0) {
			out.print("<script>alert('添加成功');location.href='list.action';</script>");
		}else {
			out.print("<script>alert('添加失败');location.href='add.jsp';</script>");
		}
	}
}
