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

<title>checkAccountWhenTransfer.jsp</title>

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
			String inCardId = request.getParameter("inCardId");
			BankBiz biz = ApplicationContext.getBankBiz();
			boolean found = biz.findAccount(inCardId);
			if (found) {
				session.setAttribute("inCardId", inCardId);
				response.sendRedirect("inputTransferMoney.jsp");
			} else {
		%>
		<span>转入方账号错误。</span>
		<a href="inputInCardId.jsp">返回</a>
		<%
			}
		%>
	</div>
</body>
</html>
