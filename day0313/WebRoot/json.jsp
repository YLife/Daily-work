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
	<script type="text/javascript">
		function change(pid) {
			/* var pid = document.getElementById("pid").value; */
			var xmlhttp = new XMLHttpRequest();
			xmlhttp.open("get", "CityServlet?pid="+pid, true);
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4) {
					var jsonArr = eval(xmlhttp.responseText);
					var city = document.getElementById("city");
					city.length = 1;
					for(var i in jsonArr){
						var o = new Option(jsonArr[i].cname, jsonArr[i].cid);
						city.add(o);
					}
				}
			};
			xmlhttp.send();
		}
	</script>

  </head>
  
  <body>
    <select id="province" onchange="change(this.value)">
    	<option>==请选择==</option>
    	<option value="1001">四川</option>
    	<option value="1002">广东</option>
    	<option value="1003">山东</option>
    </select>
    <select id="city" >
    	<option>==请选择==</option>
    </select>
  </body>
</html>
