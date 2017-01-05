<%@page import="dao.AddressInfoDao"%>
<%@page import="entity.AddressInfo"%>
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

<title>编辑联系人</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.css" />

</head>

<body>
	<div class="container">
		<%
			// 避免中文乱码
			request.setCharacterEncoding("utf-8");
			// 获取表单数据
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String phone = request.getParameter("phone");
			AddressInfo info = new AddressInfo(id, name, phone);
			// 执行编辑
			AddressInfoDao dao = new AddressInfoDao();
			int row = dao.update(info);
			// 跳转
			if (row == 1) {
				response.sendRedirect("index.jsp");
			} else {
				out.print("编辑联系人失败。");
			}
		%>
	</div>
</body>
</html>
