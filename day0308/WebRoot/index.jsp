<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
  	<s:fielderror></s:fielderror>
    <form action="user.action" method="post">
    	年龄：<input type="text" name="age"/><br>
    	生日：<input type="text" name="date"/><br>
    	数组：<input type="text" name="arr[0]"/>
    		<input type="text" name="arr[1]"/>
    		<input type="text" name="arr[2]"/><br/>
    	商品：<input type="text" name="goods.type"/>
    		<input type="text" name="goods.price"/>
    		<input type="submit" value="提交"/>
    </form>
  </body>
</html>
