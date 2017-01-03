<%@page import="config.ApplicationContext"%>
<%@page import="biz.BankBiz"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>saveMoney.jsp</title>

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
	<%
		double amount = Double.parseDouble(request.getParameter("amount"));
		String cardId = (String)session.getAttribute("cardId");
		BankBiz biz = ApplicationContext.getBankBiz();
		boolean success = biz.deposit(cardId, amount);
		if(success){
			out.print("存款成功。");
		}else{
			out.print("存款失败，请联系柜台。");
		}
	%>
	<a href="main.jsp">返回</a>
	</div>
</body>
</html>
