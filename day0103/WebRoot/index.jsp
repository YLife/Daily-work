<%@ page language="java" import="java.util.* , dao.* , entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
  		AddressInfoDao dao =  new AddressInfoDao();
  		List<AddressInfo> list = dao.list();
  	%>
  	<div class="container">
  		<h2 class="clearfix">
  			<span class="pull-left">联系人列表</span>
			<a class="pull-right" href="add.jsp">添加联系人</a>
  		</h2>
  		<table class="table tabel-bordered">
  			<thead>
  				<tr>
					<th width="25%">Id</th>
					<th width="25%">Name</th>
					<th width="25%">Phone</th>
					<th>...</th>
				</tr>
  			<thead/>
  			<tbody>
  				<%
  					for(AddressInfo info : list){
  				%>
  				<tr>
					<th width="25%">Id</th>
					<th width="25%">Name</th>
					<th width="25%">Phone</th>
					<th>...</th>
				</tr>
				<%
					}
				%>
  			</tbody>
  		</table>
  	</div>
  </body>
</html>
