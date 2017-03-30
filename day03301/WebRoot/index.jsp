<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="format"%>
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
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
  </head>
  
  <body>
  	<div class="container">
	    <table class="table table-bordered">
	    	<tr>
	    		<td>姓名</td>
	    		<td>职位</td>
	    		<td>薪水</td>
	    		<td>入职日期</td>
	    		<td>部门</td>
	    	</tr>
	    	<c:forEach items="${list }" var="e">
	    		<tr>
	    			<td>${e.ename }</td>
	    			<td>${e.job }</td>
	    			<td>${e.sal }</td>
	    			<td><format:formatDate value="${e.hiredate }" pattern="yyyy-MM-dd"/> </td>
	    			<td>${e.dept.dname }</td>
	    		</tr>
	    	</c:forEach>
	    </table>
    </div>
  </body>
</html>
