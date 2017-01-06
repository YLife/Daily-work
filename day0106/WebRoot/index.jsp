<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<link rel="stylesheet" href="css/styles.css">
	<style>
		form>div{
			margin-bottom:15px;
		}
		
		label{
			display:block;
			magin-bottom:8px;
		}
	</style>
  </head>
  
  <body>
    <div class="container">
    	<form enctype="multipart/form-data" action="upload.jsp" method="post">
    		<div>
    			<label for="">email</label>
    			<input type="text" name="email">
    		</div>
    		<div>
    			<label for="">照片</label>
    			<input type="file" name="photo">
    		</div>
    		<div>
    			<button>确定</button>
    		</div>
    	</form>
    </div>
  </body>
</html>
