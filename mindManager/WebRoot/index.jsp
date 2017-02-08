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
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/bootstrap.css" />
	<link rel="stylesheet" href="css/styles.css" />
	<style type="text/css">
		.title{
			width: 300px;
			margin: 40px auto;
		}
		span{
			font-size: 16px;
			font-weight: bold;
			padding-right: 5px;
		}
		.date{
			float: right;
			margin-right: 30px;
		}
	</style>
  </head>
  
  <body>
  	<div class="container"> 
  		<div class="title"><h1>我的心情管理器</h1></div>
  		<table class="table table-bordered">
  			<c:forEach items="${requestScope.list }" var="mind">
  				<tr>
  					<td class="clearfix">
  						<div><span>心情标题:</span><a href="id.action?id=${mind.id }">${mind.title }</a></div>
  						<div>
  							<span>心情内容:</span><br>
  							${mind.content }
  						</div>
  						<div class="date"><span>发表日期:</span>${mind.writeDate }</div>
  					</td>
  				</tr>
  			</c:forEach>	
  		</table>
  	</div>
  </body>
</html>
