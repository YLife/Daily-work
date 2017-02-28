<%@page import="com.yl.dao.DeptDao"%>
<%@page import="com.yl.entity.Dept"%>
<%@page import="com.yl.entity.Emp"%>
<%@page import="com.yl.dao.EmpDao"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    		<%
    			EmpDao dao = new EmpDao();
    			
    		
    		    dao.queryEmps();
    			dao.queryEmps();
    			dao.queryEmps();
    			List<Emp> list= dao.queryEmps();
    			for(Emp e : list){
    				out.print(e.getEname()+":"+e.getDept().getDname()+"<br/>");
    			}
    		/* DeptDao deptDao = new DeptDao();
    			List<Dept> list = deptDao.queryDepts();
    			for(Dept d : list){
    				out.print(d.getDname()+"<br/>");
    			    for(Iterator<Emp> it = d.getEmps().iterator();it.hasNext();){
    			    	Emp e = it.next();
    			    	out.print("&nbsp;&nbsp;"+e.getEname()+"<br/>");
    			    }
    			} */
    		%>
  </body>
</html>
