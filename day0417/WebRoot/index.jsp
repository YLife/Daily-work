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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
	<script type="text/javascript">
		function check() {
			var params = {};
			params.id = 1;
			params.name = "sb";
			$.ajax({
				 async:false,  
			     type: "POST",  
			     url: "/test1",//注意路径  
			     data:params,  
			     dataType:"json",  
		         success:function(data){  
		            if(data.result=='SUCCESS'){  
		                alert("修改成功");  
		            }else{  
		                alert("修改失败，失败原因【" + data + "】");  
		            }  
		         },  
		         error:function(data){  
		            alert(data.result);  
		         }
			});
		}
	</script>
  </head>
  
  <body>
    <button onclick="check()">点击</button>
  </body>
</html>
