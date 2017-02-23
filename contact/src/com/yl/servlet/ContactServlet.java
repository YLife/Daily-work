package com.yl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.ContactBiz;
import com.yl.entity.Contact;

public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContactBiz biz = new ContactBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String currentPage = request.getParameter("currentPage");
		String pageSize = request.getParameter("pageSize");
		int page = currentPage != null ? Integer.parseInt(request.getParameter("currentPage")) : 1;
		int size = pageSize != null ? Integer.parseInt(request.getParameter("pageSize")) : 5;
		List<Contact> list = biz.findContacts(page, size);
		int totalPage = biz.getTotalPage(size);
		request.setAttribute("list", list);
		request.setAttribute("currentPage", page);
		request.setAttribute("pageSize", size);
		request.setAttribute("totalPage", totalPage);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
