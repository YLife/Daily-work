package com.yl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.biz.EmpBiz;
import com.yl.biz.impl.EmpBizImpl;
import com.yl.entity.Emp;

public class DoEditServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private EmpBiz eb = new EmpBizImpl();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String sal = request.getParameter("sal");
		String hiredate = request.getParameter("hiredate");
		String empno = request.getParameter("empno");
		Emp emp = new Emp();
		emp.setEmpno(Integer.parseInt(empno));
		emp.setEname(ename);
		emp.setJob(job);
		emp.setSal(Float.parseFloat(sal));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			emp.setHiredate(sdf.parse(hiredate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int count = eb.updateEmp(emp);
		if(count > 0){
			response.getWriter().print("<script>alert('更新成功');location.href='emp.action'</script>");
		}else{
			response.getWriter().print("<script>alert('更新失败');location.href='edit.action?empno="+emp.getEmpno()+"'</script>");
			
		}
	}

}
