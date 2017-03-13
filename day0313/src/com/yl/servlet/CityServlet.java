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
			list.add(new City(1, "成都"));
			list.add(new City(2, "绵阳"));
			list.add(new City(3, "德阳"));
		}else if ("1002".equals(pid)) {
			list.add(new City(4, "广州"));
			list.add(new City(5, "东莞"));
			list.add(new City(6, "惠州"));
		}else if ("1003".equals(pid)) {
			list.add(new City(7, "济南"));
			list.add(new City(8, "青岛"));
		}
		response.getWriter().print(list);
		
	}

}
