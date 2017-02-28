<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
  	<table border="1" cellpadding="0px;" cellspacing="0px;">
  		<tr align="center">
  			<td>姓名</td>
  			<td>职位</td>
  			<td>薪水</td>
  			<td>奖金</td>
  			<td>部门经理</td>
  			<td>入职日期</td>
  			<td>部门名称</td>
  			<td>操作</td>
  		</tr>
  		<c:forEach items="${list }" var="emp">
  			<tr align="center">
	  			<td>${emp.ename }</td>
	  			<td>${emp.job }</td>
	  			<td>${emp.sal }</td>
	  			<td>${emp.comm }</td>
	  			<td>${emp.mgr }</td>
	  			<td>${emp.hiredate }</td>
	  			<td>${emp.dept.dname }</td>
	  			<td>操作</td>
  			</tr>
  		</c:forEach>
  	</table>
  </body>
</html>
