<%@ page language="java" import="java.util.*, config.*, biz.*, entity.*"
	pageEncoding="utf-8"%>
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

<title>checkAccount.jsp</title>

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
			// 获取请求提交的数据
			String cardId = request.getParameter("cardId");
			String pwd = request.getParameter("pwd");
			// 调用业务逻辑层进行账户校验
			BankBiz biz = ApplicationContext.getBankBiz();
			boolean success = biz.checkAccount(cardId, pwd);
			if (success) {
				session.setAttribute("cardId", cardId);
				// 重定向到main.jsp
				response.sendRedirect("main.jsp");
			} else {
				// 提示错误
				out.print("密码错误。");
				out.print("<a href=\"index.jsp\">返回</a>");
			}
		%>
	</div>
</body>
</html>
