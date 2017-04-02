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
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
  </head>
  
  <body>
    <div class="container">
    	<form action="queryBills.action" method="post">
    	<table class="table table-bordered">
    		<tr align="center"><td colspan="5"><h3>记账管理</h3></td></tr>
    		<tr><td colspan="5">
    			类型：
    			<select name="vo.type">
    				<option>--请选择--</option>
    				<c:forEach items="${tlist }" var="t">
    					<option value="${t.id }">${t.name }</option>
    				</c:forEach>
    			</select>
    			时间：
    			<input type="text" name="vo.begin"> - 
    			<input type="text" name="vo.end">
    			<input type="submit" value="搜索">
    			<input type="button" value="记账">
    		</td></tr>
    		<tr>
    			<td>标题</td>
    			<td>记账时间</td>
    			<td>类别</td>
    			<td>金额</td>
    			<td>说明</td>
    		</tr>
    		<c:forEach items="${list }" var="b">
	    		<tr>
	    			<td>${b.title }</td>
	    			<td>${b.billTime }</td>
	    			<td>${b.billType.name }</td>
	    			<td>${b.price }</td>
	    			<td>${b.explain }</td>
	    		</tr>
    		</c:forEach>
    	</table>
    	</form>
    </div>
  </body>
</html>
