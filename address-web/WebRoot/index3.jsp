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
		request.setCharacterEncoding("utf-8");
		int pageSize = 5;
		AddressInfoDao dao = new AddressInfoDao();
		int rowCount = dao.list().size();
		int maxPageNo = (rowCount - 1) / pageSize + 1;
		// 你点的是哪一个
		String action = request.getParameter("action");
		// 页码
		int pageNo = 1;
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(Cookie coo:cookies){
				if("pageNo".equals(coo.getName())){
					pageNo = Integer.parseInt(coo.getValue());
					break;
				}
			}
		}
		
		
		if ("下一页".equals(action) && pageNo < maxPageNo) {
			pageNo += 1;
		}
		
		if("上一页".equals(action) && pageNo > 1){
			pageNo -= 1;
		}

		Cookie coo = new Cookie("pageNo", String.valueOf(pageNo));
		coo.setPath("/address-web/index3.jsp");
		response.addCookie(coo);

		List<AddressInfo> list = dao.page(pageNo, pageSize);
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
		<div>
			<form action="" method="post" class="pull-right">
				<input type="submit" value="下一页" name="action"
					class="btn btn-default" />
			</form>
			<form action="" method="post" class="pull-right">
				<input type="submit" value="上一页" name="action"
					class="btn btn-default" />
			</form>
		</div>
	</div>
</body>
</html>
