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
    
    <title>My JSP 'load.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
  </head>
  
  <body>
    <div class="container2">
    	<form action="save.action" method="post">
    		<input type="hidden" name="questions.id" value="${questions.id }">
    		<table class="table">
    			<tr>
    				<td><label>问题：</label><input type="text" name ="questions.title" value="${questions.title }" style="background-color: #ccc;"> </td>
    			</tr>
    			<tr>
    				<td><label>问题描述：</label><input type="text" name ="questions.detailDesc" value="${questions.detailDesc}" style="background-color: #ccc;"> </td>
    			</tr>
    			<tr>
    				<td><label>网友回答：</label>
	    				<c:forEach items="${questions.answerses }" var="answers">
	    					<div style="background-color: #ccc;">
	    						${answers.ansDate }<br>
	    						${answers.ansContent }
	    					</div>
	    				</c:forEach>
    				</td>
    			</tr>
    			<tr>
    				<td><label>我来回答：</label> 
    					<textarea rows="3" cols="30" name="answers.ansContent"></textarea>
    				 </td>
    			</tr>
    			<tr align="center">
    				<td><input type="submit" value="提交评论"> <a href="list.action">返回首页</a> </td>
    			</tr>
    		</table>
    	</form>
    </div>
  </body>
</html>
