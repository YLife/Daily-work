package json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String cid = request.getParameter("cid");
		List<City> list = new ArrayList<City>();
		if (cid.equals("1001")) {
			list.add(new City(1, "�ɶ�"));
			list.add(new City(2, "����"));
			list.add(new City(3, "����"));
		}else if (cid.equals("1002")) {
			list.add(new City(4, "����"));
			list.add(new City(5, "��ݸ"));
			list.add(new City(6, "����"));
		}else {
			list.add(new City(7, "�ൺ"));
			list.add(new City(8, "����"));
		}
		response.getWriter().print(list);
	}

}
