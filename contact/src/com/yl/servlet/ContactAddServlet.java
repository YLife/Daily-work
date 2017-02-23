package com.yl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.ContactBiz;
import com.yl.entity.Contact;
import com.yl.entity.Relation;

public class ContactAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContactBiz biz = new ContactBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String contactName = request.getParameter("contactName");
		String contactPhone = request.getParameter("contactPhone");
		String contactMail = request.getParameter("contactMail");
		String relationName = request.getParameter("relation");
		Relation relation = new Relation();
		relation.setRelationName(relationName);
		Contact contact = new Contact();
		contact.setContactName(contactName);
		contact.setContactPhone(contactPhone);
		contact.setContactMail(contactMail);
		contact.setRelation(relation);
		try {
			biz.saveContact(contact, relation);
			out.print("<script>alert('添加成功');location.href='ContactServlet';</script>");
		} catch (Exception e) {
			out.print("<script>alert('添加失败');location.href='add.jsp';</script>");
		}
	}

}
