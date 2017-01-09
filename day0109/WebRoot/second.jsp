<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib  uri="/WEB-INF/myTag.tld" prefix="my"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'second.jsp' starting page</title>
    
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
	<a href="index.jsp?name=admin">index.jsp</a>
	<br>
	<c:if test="${param.age <18 }">
       		年龄小于18
       </c:if>
	<c:if test="${param.age >=18  && param.age<=30 }">
       		年龄大于18并且小于等于30
       </c:if>
	<c:if test="${param.age >30   }">
       		年龄大于30
       </c:if>
	<br>
	
	<c:choose>
		<c:when test="${param.age >30 }">
			年龄大于30；
		</c:when>
		<c:otherwise>
			年龄小于30；
		</c:otherwise>
	</c:choose>
</body>
</html>
