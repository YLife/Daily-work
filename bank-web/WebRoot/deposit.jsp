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

<title>deposit.jsp</title>

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
		<form action="saveMoney.jsp" method="post">
			<div class="form-group">
				<label>存款金额：</label>
				<input type="text" name="amount" class="form-control" />
			</div>
			<div class="form-group text-right">
				<button class="btn btn-default">确定</button>
			</div>
		</form>
	</div>
</body>
</html>
