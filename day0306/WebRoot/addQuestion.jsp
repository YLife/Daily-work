<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addQuestion.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	<script type="text/javascript">
		function check() {
			var question = document.getElementById("question");
			var desc = document.getElementById("desc");
			if (question.value.length == 0) {
				alert('问题不能为空！');
				return false;
			}
			if (desc.value.length == null) {
				alert('问题描述不能为空！');
				return false;
			}
			
		}
	</script>

  </head>
  
  <body>
    <div class="container1">
    	<form action="addQuestion.action" method="post" onsubmit="return check()">
	    	<table class="table table-bordered" >
	    		<tr align="center">
	    			<td><h3>我要提问</h3></td>
	    		</tr>
	    		<tr align="center">
	    			<td><h4><a href="list.action">返回首页</a></h4></td>
	    		</tr>
	    		<tr align="center">
	    			<td><label>问题：</label><input type="text" name="questions.title" id="question"> </td>
	    		</tr>
	    		<tr align="center">
	    			<td><label style="position: relative;top: -30px;">问题描述：</label><textarea rows="3" cols="30" name="questions.detailDesc" id="desc"></textarea> </td>
	    		</tr>
	    		<tr align="center">
	    			<td><input type="submit" value="保存问题"> </td>
	    		</tr>
	    	</table>
    	</form>
    </div>
  </body>
</html>
