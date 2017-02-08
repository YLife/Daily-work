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
    
    <title>My JSP 'edit.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/bootstrap.css" />
	<link rel="stylesheet" href="css/styles.css" />
	<script type="text/javascript">
		function check() {
			var title = document.getElementById("title").value;
			var content = document.getElementById("content").value;
			var writeDate = document.getElementById("writeDate").value;
			if (title.length == 0) {
				alert("标题不能为空!");
				return false;
			}
			if (content.length == 0) {
				alert("内容不能为空");
				return false;
			}
			var reg = /^\d{4}-\d{2}-\d{2}$/
			if (!reg.test(writeDate)) {
				alert("日期格式不正确");
				return false;
			}
			return true;
		}
	</script>
	<style type="text/css">
		span{
			font-size: 20px;
			font-weight: bold;
			padding-right: 5px;
		}
	</style>
  </head>
  
  <body>
    <div class="container">
    	<form action="edit.action?id=${entity.id }" method="post" onsubmit="return check()">
    		<table class="table table-bordered">
    			<tr>
    				<td style="text-align: center"><span>编辑心情</span></td>
    			</tr>
    			<tr>
    				<td>
    					<span>心情标题:</span>
    					<input type="text" name="title" value="${entity.title }" id="title">
    				</td>
    			</tr>
    			<tr>
    				<td>
    					<span style="position: relative;bottom: 30px;">心情内容:</span>
    					<textarea rows="3" cols="50" name="content" id="content">${entity.content }</textarea>
    				</td>
    			</tr>
    			<tr>
    				<td>
    					<span>发表日期:</span>
    					<input type="text" name="writeDate" value="${entity.writeDate }" id="writeDate">(日期格式：yyyy-mm-dd)
    				</td>
    			</tr>
    			<tr>
    				<td class="text-center">
    					<input type="submit" value="提交">
    					<input type="submit" value="重置" >
    				</td>
    			</tr>
    		</table>
    	</form>
    </div>
  </body>
</html>
