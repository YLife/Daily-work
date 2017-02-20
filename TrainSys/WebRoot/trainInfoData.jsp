<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'trainInfoData.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/styles.css">
  </head>
  
  <body>
    <div class="container2">
    	<table class="table table-bordered">
    		<tr align="center">
    			<td colspan="2" style="font-size: 20px; font-weight: bold; background-color: #ccc">火车车次详情</td>
    		</tr>
    		<tr align="center" style="font-size: 18px; font-weight: bold;">
    			<td>车次</td>
    			<td>${trainInfo.trainNo }</td>
    		</tr>
    		<tr align="center" style="font-size: 18px; font-weight: bold;">
    			<td>发车--到达</td>
    			<td>${trainInfo.startStation}--${trainInfo.arrivalStation }</td>
    		</tr>
    		<tr align="center" style="font-size: 18px; font-weight: bold;">
    			<td>发时--到时</td>
    			<td>${trainInfo.startTime }--${trainInfo.arrivalTime }</td>
    		</tr>
    		<tr align="center" style="font-size: 18px; font-weight: bold;">
    			<td>车型</td>
    			<td>${trainInfo.type }</td>
    		</tr>
    		<tr align="center" style="font-size: 18px; font-weight: bold;">
    			<td>运行时间</td>
    			<td>${trainInfo.runtime }</td>
    		</tr>
    		<tr align="center" style="font-size: 18px; font-weight: bold;">
    			<td>里程(公里)</td>
    			<td>${trainInfo.mile }</td>
    		</tr>
    		<tr align="center">
    			<td colspan="2"><button  onclick="window.history.go(-1)" class="btn btn-success">返回</button></td>
    		</tr>
    	</table>
    </div>
  </body>
</html>
