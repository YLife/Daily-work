package com.yl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.ContactBiz;
import com.yl.entity.Contact;

public class ContactDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContactBiz biz = new ContactBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String contactId = request.getParameter("contactId");
		Contact contact = biz.findContact(Integer.parseInt(contactId));
		try {
			biz.delContact(contact);
			out.print("<script>alert('É¾³ý³É¹¦');window.location.href='ContactServlet'</script>");
		} catch (Exception e) {
			out.print("<script>alert('É¾³ýÊ§°Ü');window.history.go(-1)</script>");
		}
	}

}
