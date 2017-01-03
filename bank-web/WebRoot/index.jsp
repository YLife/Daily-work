<%@ page language="java" import="java.util.*, java.text.*"
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

<title>index.jsp</title>
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
		<form action="checkAccount.jsp" method="post">
			<div class="form-group">
				<label>卡号：</label> <input type="text" name="cardId"
					class="form-control" />
			</div>
			<div class="form-group">
				<label>输入密码：</label> <input type="password" name="pwd"
					class="form-control" />
			</div>
			<div class="text-right">
				<input type="submit" value="确定" class="btn btn-default" />
			</div>
		</form>
	</div>
</body>
</html>
