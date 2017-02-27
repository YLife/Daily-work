<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/styles.css">
  </head>
  
  <body>
    <div class="container">
    	<form action="QuestionServlet" method="post" style="margin-left: 350px; ">
    		<label>科目：</label>
    		<select name="subjectId">
    			<option value="">==请选择==</option>
    			<c:forEach items="${slist }" var="s">
    				<option value="${s.subjectId }" ${s.subjectId == subjectId ? "selected" : ""}> ${s.subjectName }</option>
    			</c:forEach>
    		</select>
    		<input type="submit">
    		<a href="QuestionAddServlet">添加试题</a>
    	</form>
    	<table class="table table-bordered">
    		<tr style="background-color: #ccc;">
    			<td>题干</td>
    			<td>A、选项</td>
    			<td>B、选项</td>
    			<td>C、选项</td>
    			<td>D、选项</td>
    			<td>答案</td>
    		</tr>
    		<c:forEach items="${list }" var="q">
    			<tr>
    				<td>${q.question }</td>
    				<td>${q.option_a }</td>
    				<td>${q.option_b }</td>
    				<td>${q.option_c }</td>
    				<td>${q.option_d }</td>
    				<td>${q.answer }</td>
    			</tr>
    		</c:forEach>
    		<tr align="center">
    			<td colspan="6">
    				<c:if test="${currentPage <= 1 }">
    					上一页
    				</c:if>
    				<c:if test="${currentPage > 1 }">
    					上一页
    				</c:if>
    				<c:if test="${currentPage <= totalPage }">
    					下一页
    				</c:if>
    				<c:if test="${currentPage > totalPage }">
    					下一页
    				</c:if>
    			</td>
    		</tr>
    	</table>
    </div>
  </body>
</html>
