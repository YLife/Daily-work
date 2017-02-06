package com.yl.severlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.impl.dao.ContactImpl;
import com.yl.interfaes.dao.ContactDao;

public class DeleteAction extends HttpServlet {
	private ContactDao cd = new ContactImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int contactId = Integer.parseInt(request.getParameter("contactId"));
		int row = cd.deleteContact(contactId);
		if (row > 0) {
			out.print("<script>alert('É¾³ý³É¹¦');location.href='list.action';</script>");
		} else {
			out.print("<script>alert('É¾³ýÊ§°Ü');location.href='list.action';</script>");
		}
	}

}
