<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/myTag.tld"  prefix="my"%>
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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  	
<body>
    <my:out value="hello world!"/>
  	<%
  		request.setAttribute("k1", "v1");
  		session.setAttribute("k2", "v2");
  	%>
  	<br> ${requestScope.k1 }
	<br> ${sessionScope.k2 }
	<br> ${param.name }


	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
		</tr>
		<c:forEach items="${requestScope.list }" var="u">
			<tr>
				<td>${u.id }</td>
				<td>${u.name }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
