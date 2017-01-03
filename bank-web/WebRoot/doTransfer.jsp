<%@ page import="config.ApplicationContext"%>
<%@ page language="java" import="java.util.*, biz.*"
	pageEncoding="UTF-8"%>
<%@ include file="auth.jsp"%>
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

<title>dpTransfer.jsp</title>

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
			BankBiz biz = ApplicationContext.getBankBiz();
			String outCardId = (String) session.getAttribute("cardId");
			String inCardId = (String) session.getAttribute("inCardId");
			session.removeAttribute("inCardId");
			double transferMoney = Double.parseDouble(request
					.getParameter("transferMoney"));
			boolean success = biz.trans(outCardId, inCardId, transferMoney);
			if (success) {
				out.print("转账成功。");
			} else {
				out.print("转账失败。");
			}
		%>
		<a href="main.jsp">返回</a>
	</div>

</body>
</html>
