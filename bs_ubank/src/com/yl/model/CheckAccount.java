package com.yl.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yl.impl.biz.BankBizImpl;
import com.yl.interfaces.biz.BankBiz;

public class CheckAccount extends HttpServlet {
	
	/**
	 *
	 *@param
	 */
	private static final long serialVersionUID = 1787467749038277277L;

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String cardId = request.getParameter("cardId");
		String pwd = request.getParameter("pwd");
		BankBiz biz = new BankBizImpl();
		String str = biz.checkAcccount(cardId, pwd);
		if ((BankBiz.A).equals(str)) {
			out.print(BankBiz.A);
		}else if ((BankBiz.P).equals(str)) {
			out.print(BankBiz.P);
		}else if ((BankBiz.S).equals(str)) {
			session.setAttribute("cardId", cardId);
			response.sendRedirect("main.jsp");
		}
	}

}
