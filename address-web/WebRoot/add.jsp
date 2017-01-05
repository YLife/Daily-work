<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>添加联系人</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.css" />

</head>

<body>
	<div class="container">
		<h2>添加联系人</h2>
		<form action="doAdd.jsp" method="post">
			<div class="form-group">
				<label for="">姓名</label> <input type="text" name="name"
					class="form-control" />
			</div>
			<div class="form-group">
				<label for="">手机号码</label> <input type="text" name="phone"
					class="form-control" />
			</div>
			<div>
				<button class="btn btn-primary">保存联系人</button>
			</div>
		</form>
	</div>
</body>
</html>
