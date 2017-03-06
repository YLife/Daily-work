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
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
  </head>
  <body>
  	<div class="container">
  		<table class="table table-bordered">
  			<tr align="center">
  				<td colspan="4"><h2>在线问答</h2></td>
  			</tr>
  			<tr align="center">
  				<td colspan="4"><h4><a href="addQuestion.jsp">我要提问</a></h4></td>
  			</tr>
  			<tr align="center" style="background-color: #ccc">
			  <td>序号</td>
			  <td>问题</td>
			  <td>回答次数</td>
			  <td>最后修改</td>			
  			</tr>
  			<c:forEach items="${list }" var="q" varStatus="statu">
  				<tr align="center" style="background-color: ${statu.count % 2 == 0 ? '#ccc' : ''}">
  					<td>${q.id }</td>
  					<td><a href="load.action?questions.id=${q.id }">${q.title }</a></td>
  					<td>${q.answerCount }</td>
  					<td>${q.lastModified }</td>
  				</tr>
  			</c:forEach>
  		</table>
  	</div>
  </body>
</html>
