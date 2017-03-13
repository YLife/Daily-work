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
	<script type="text/javascript">
		function check() {
			var uname = document.getElementById("uname").value;
			var xmlHttp = new XMLHttpRequest();
			xmlHttp.open("get", "HelloServlet?uname="+uname, false);
			xmlHttp.onreadystatechange = function() {
				/* alert(xmlHttp.readyState); */
				if (xmlHttp.readyState == 4) {
					var text = xmlHttp.responseText;
					alert(text);
				}
			};
			xmlHttp.send();
		}
	</script>
  </head>
  
  <body>
  	<select>
  		<option>aaa</option>
  		<option>bbb</option>
  		<option>ccc</option>
  	</select>
    <input type="text" onblur="check()" name="uname" id="uname"/>
  </body>
</html>
