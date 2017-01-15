<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'edit.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<form action="doEdit.action" method="post">
		<input type="hidden" value="${emp.empno }" name="empno" />
		<table>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="ename" value="${emp.ename }" /></td>
			</tr>
			<tr>
				<td>职位：</td>
				<td><input type="text" name="job" value="${emp.job }" /></td>
			</tr>
			<tr>
				<td>薪水：</td>
				<td><input type="text" name="sal" value="${emp.sal}" /></td>
			</tr>
			<tr>
				<td>入职日期：</td>
				<td><input type="text" name="hiredate" value="${emp.hiredate }" />
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="修改" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
