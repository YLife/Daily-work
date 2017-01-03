<%@ page import="config.ApplicationContext"%>
<%@ page language="java" import="java.util.*, biz.*"
	pageEncoding="UTF-8"%>
	
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

<title>balance.jsp</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">

</head>

<body>
	<%
		BankBiz biz = ApplicationContext.getBankBiz();
		String cardId = (String) session.getAttribute("cardId");
		double balance = biz.getBalance(cardId);
	%>
	<div class="container">
		<p>
			当前余额：<%=balance%>
			<a href="main.jsp">返回</a>
		</p>
	</div>

</body>
</html>
