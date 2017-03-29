<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'json.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function getCity(cid) {
			var xmlhttp = new XMLHttpRequest();
			xmlhttp.open("get", "GetCityServlet?cid="+cid, "true");
			xmlhttp.onreadystatechange = function() {
				var city = document.getElementById("city");
				if (xmlhttp.readyState == 4) {
					var jsonArr = eval(xmlhttp.responseText);
					city.length = 1;
					for ( var i in jsonArr) {
						var o = new Option(jsonArr[i].cname, jsonArr[i].cid);					
						city.add(o);
					}
				}
			};
			xmlhttp.send();
		};
	</script>
  </head>
  
  <body>
  	省份：
    <select id="province" onchange="getCity(this.value)">
    	<option>--请选择--</option>
    	<option value="1001">四川</option>
    	<option value="1002">广东</option>
    	<option value="1003">山东</option>
    </select>
          城市：
    <select id="city">
    	<option>--请选择--</option>
    </select>
 </body>
</html>