<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查询考试</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/styles.css">
	<style type="text/css">
		.title {
			height: 50px;
			background-color: #ccc;
			font-size: 18px;
			font-weight: bold;
			
		}
	</style>
  </head>
  
  <body>
    <div class="container">
    	<div class="container1">
    		<form action="subject.action" method="post">
    			<label>科目：</label>
    			<select name="subject">
    				<option value="0">--请选择--</option>
    				<option value="1">JSP</option>
    				<option value="2">OOP</option>
    				<option value="3">JavaScript</option>
    			</select>
    			<input type="submit" value="查询" style="margin:0px 10px;">
    			<a href="#">添加试题</a>
    		</form>
    	</div>
    	<table class="table table-bordered">
    		<tr class="title">
    			<td style="vertical-align: middle;">题干</td>
    			<td style="vertical-align: middle;">A、选项</td>
    			<td style="vertical-align: middle;">B、选项</td>
    			<td style="vertical-align: middle;">C、选项</td>
    			<td style="vertical-align: middle;">D、选项</td>
    			<td style="vertical-align: middle;">答案</td>
    		</tr>
    		<c:forEach items="${list }" var="con">
    			<tr>
	    			<td>${con.question }</td>
	    			<td>${con.option_a }</td>
	    			<td>${con.option_b }</td>
	    			<td>${con.option_c }</td>
	    			<td>${con.option_d }</td>
	    			<td>${con.answer }</td>
	    		</tr>	
    		</c:forEach>
    	</table>
    </div>
  </body>
</html>
