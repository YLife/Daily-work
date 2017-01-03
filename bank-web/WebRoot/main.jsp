<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="auth.jsp" %>


<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>main.jsp</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<style>
	a{
		width: 150px;
	}
</style>
</head>

<body>
	<div class="container">
		<h3>卡号：<%=session.getAttribute("cardId") %></h3>
		<p class="clearfix">
			<a href="deposit.jsp" class="pull-left btn btn-default">存款</a>
			<a href="withDraw.jsp" class="pull-right btn btn-default">取款</a>
		</p>
		<p class="clearfix">
			<a href="balance.jsp" class="pull-left btn btn-default">查询</a>
			<a href="inputInCardId.jsp" class="pull-right btn btn-default">转账</a>
		</p>
		<p class="clearfix">
			<a href="exit.jsp" class="pull-right btn btn-default">退出</a>
		</p>
	</div>
</body>
</html>
