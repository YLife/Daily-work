<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/styles.css">
	<style type="text/css">
		.title{
			background-color: #ccc;
			height: 50px;
			font-size: 20px;
			font-weight: bold;
		}
		input{
			width: 120px;
		}
	</style>
	<script type="text/javascript">
		function doSubmit(currentPage) {
			document.getElementById("page").value = currentPage;
			document.forms[0].submit();
		}
	</script>
  </head>
  
  <body>
    <div class="container">
    	<table class="table table-bordered">
    		<tr>
    			<td colspan="8" style="height:70px; vertical-align: middle;">
    				<form action="emp.action" method="post" style="margin: 2px; padding: 2px;">
    					<input type="hidden" name="currentPage" value="1" id="page">
    					<label>姓名:</label>
    					<input type="text" name="ename" style="margin-right: 10px;" value="${ename }">
    					<label>部门编号:</label>
    					<select style="margin-right: 10px;" name="deptno">
    						<option value="">--请选择--</option>
    						<c:forEach items="${dlist }" var="dept">
    							<option ${deptno==dept.deptNo ? "selected" : "" } value="${dept.deptNo }">${dept.dName }</option>
    						</c:forEach>
    					</select>
    					<label>入职时间:</label>
    					<input type="text" name="begin" value="${begin }"> - 
    					<input type="text" name="end" value="${end }" style="margin-right: 5px;">
    					<input type="submit" value="搜索">
    				</form>
    			</td>
    		</tr>
    		<tr class="title">
    			<td style="vertical-align: middle;">姓名</td>
    			<td style="vertical-align: middle;">职位</td>
    			<td style="vertical-align: middle;">薪水</td>
    			<td style="vertical-align: middle;">奖金</td>
    			<td style="vertical-align: middle;">上司</td>
    			<td style="vertical-align: middle;">入职日期</td>
    			<td style="vertical-align: middle;">部门</td>
    			<td style="vertical-align: middle;">操作</td>
    		</tr>
    		<c:forEach items="${list }" var="emp">
    			<tr>
    				<td>${emp.eName }</td>
    				<td>${emp.job }</td>
    				<td>${emp.sal }</td>
    				<td>${emp.comm }</td>
    				<td>${emp.mgr }</td>
    				<td>${emp.hireDate }</td>
    				<td>${emp.dept.dName }</td>
    				<td><a href="#">编辑</a></td>
    			</tr>
    		</c:forEach>
    		<tr>
    			<td colspan="8" align="center">
    				<a href="javascript:doSubmit(1);">首页</a>
    				<c:if test="${currentPage <= 1 }">
    					上一页
    				</c:if>
    				<c:if test="${currentPage > 1 }">
    					<a href="javascript:doSubmit(${currentPage - 1 });">上一页</a>
    				</c:if>
    				<c:if test="${currentPage < totalPage }">
    					<a href="javascript:doSubmit(${currentPage + 1 });">下一页</a>    					
    				</c:if>
    				<c:if test="${currentPage >= totalPage }">
    					下一页
    				</c:if>
    				<a href="javascript:doSubmit(${totalPage });">尾页</a>
    			</td>
    		</tr>
    	</table>
    </div>
  </body>
</html>
