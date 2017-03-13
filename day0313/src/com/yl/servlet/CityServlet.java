package com.yl.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.pojo.City;

public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("application/json;charset=utf-8");
		String pid = request.getParameter("pid");
		System.out.println(pid);
		List<City> list = new ArrayList<City>();
		if ("1001".equals(pid)) {
			list.add(new City(1, "�ɶ�"));
			list.add(new City(2, "����"));
			list.add(new City(3, "����"));
		}else if ("1002".equals(pid)) {
			list.add(new City(4, "����"));
			list.add(new City(5, "��ݸ"));
			list.add(new City(6, "����"));
		}else if ("1003".equals(pid)) {
			list.add(new City(7, "����"));
			list.add(new City(8, "�ൺ"));
		}
		response.getWriter().print(list);
		
	}

}
