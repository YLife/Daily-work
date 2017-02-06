package com.yl.severlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.entity.ContactBook;
import com.yl.impl.dao.ContactImpl;
import com.yl.interfaes.dao.ContactDao;

public class ListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContactDao cd = new ContactImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		List<ContactBook> list = cd.queryAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
