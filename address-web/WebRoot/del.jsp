<%@page import="entity.AddressInfo"%>
<%@page import="dao.AddressInfoDao"%>
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

<title>删除联系人</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.css" />

</head>

<body>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		AddressInfoDao dao = new AddressInfoDao();
		AddressInfo info = dao.findById(id);
	%>
	<div class="container">
		<h2>删除联系人</h2>
		<form action="doDel.jsp" method="post">
			<input type="hidden" name="id" value="<%=info.getId()%>" />
			<dl>
				<dt>姓名：</dt>
				<dd><%=info.getName() %></dd>
				<dt>手机号码：</dt>
				<dd><%=info.getPhone() %></dd>
			</dl>
			<div>
				<button class="btn btn-danger">确认删除联系人</button>
				<a href="index.jsp" class="btn btn-default">取消</a>
			</div>
		</form>
	</div>
</body>
</html>
