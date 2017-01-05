<%@page import="util.Pagination"%>
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

<title>联系人列表</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.css" />
</head>

<body>
	<%
		AddressInfoDao dao = new AddressInfoDao();
		// 分页逻辑处理对象
		Pagination pag = new Pagination(request, response, dao.list()
				.size());

		List<AddressInfo> list = dao.page(pag.getPageNo(),
				pag.getPageSize());
	%>
	<div class="container">
		<h2 class="clearfix">
			<span class="pull-left">联系人列表</span> <a class="pull-right"
				href="add.jsp">添加联系人</a>
		</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th width="25%">Id</th>
					<th width="25%">Name</th>
					<th width="25%">Phone</th>
					<th>...</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (AddressInfo info : list) {
				%>
				<tr>
					<td><%=info.getId()%></td>
					<td><%=info.getName()%></td>
					<td><%=info.getPhone()%></td>
					<td><a href="edit.jsp?id=<%=info.getId()%>"
						class="btn btn-success">编辑联系人</a> <a
						href="del.jsp?id=<%=info.getId()%>" class="btn btn-danger">删除联系人</a>
					</td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
		<!-- 分页区 -->
		<div class="text-right">
			<ul class="pagination">
				<%=pag.getHtml() %>
			</ul>
		</div>
		
		<!-- 
		<div class="text-right">
			<ul class="pagination">
				<li><a href="index.jsp?pageNo=<%=pag.getPreviousPageNo()%>">上一页</a></li>
				<li><a href="index.jsp?pageNo=<%=pag.getNextPageNo()%>">下一页</a></li>
			</ul>
		</div>
		-->
	</div>
</body>
</html>
