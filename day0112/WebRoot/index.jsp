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
	<script type="text/javascript" src="js/net.js"></script>
	<script type="text/javascript">
		function f1() {
			window.open('http://localhost:8080/contact-web/index.jsp');
		}
		
		function f3() {
			var a = 5;
			a = "abc";
			a = true ; 
			if(a){
				alert(typeof(a));
			}
		}
		
		function f4() {
			var a = "31243abc432413421";
			alert(parseInt(a));
			a = '3.32143ggfd123432';
			alert(parseFloat(a));
		}
		
		function f5() {
			var a = sum;
			alert(a(1 , 2));
			var r = a(3 , 4);
			alert(r);
			var h = a(1);
			alert(h);
		}
		
		function sum(a , b) {
			return a + b; 
		}
		
		function f6() {
			for(var i = 0 ; i < 10 ; i++){
				div1.innerHTML=div1.innerHTML+i+"<br>";
			}
		}
	</script>
  </head>
  
  <body>
    <input type="button" value="in_line" onclick="window.open('http://localhost:8080/contact-web/index.jsp')"/>
    <input type="button" value="inner" onclick="f1()"/>
    <input type="button" value="in_line" onclick="f2()"/>
    <input type="button" value="get type of date" onclick="f3()">
    <input type="button" value="cast" onclick="f4()">
    <input type="button" value="diy function" onclick="f5()">
    <input type="button" value="for_cycle" onclick="f6()">
    <div id="div1"></div>
  </body>
</html>
