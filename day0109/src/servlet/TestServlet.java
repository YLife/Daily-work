package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Users;

public class TestServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Users> list = new ArrayList<Users>();
		for (int i = 0; i < 10; i++) {
			Users user = new Users();
			user.setId(""+i);
			user.setName("name"+i);
			list.add(user);
		}
		System.out.println(list.get(5).getName());
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
