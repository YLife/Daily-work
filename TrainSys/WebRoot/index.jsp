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
    
    <title>车次信息管理系统</title>
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
		function del() {
			var obj = document.fom.elements;
			var a = 0;
			for (var i = 0; i < obj.length; i++) {
				if ( obj[i].name == "trainNo" && obj[i].checked == true) {
					a += 1;
				}
			}
			
			if (a > 0) {
				var fom = document.getElementById("fom");
				fom.action = "TrainInfoDelServlet";
				fom.submit();	
			} else{
				alert("请选择车次!");
			}
		}
	</script>
  </head>
  
  <body>
    <div class="container">
    <form action="TrainInfoServlet" method="post" id="fom" name="fom" style="margin: 2px; padding: 2px;">
    	<table class="table table-bordered">
    		<tr>
    			<td colspan="8" style="height:70px; vertical-align: middle;">
    					<input type="hidden" name="currentPage" value="1" id="page">
    					<select style="margin-right: 10px;" name="type">
    						<option value="">==请选择==</option>
    						<option value="1" ${type == 1 ? "selected" : "" }>按出发时间查询</option>
    						<option value="2" ${type == 2 ? "selected" : "" }>按到达时间查询</option>
    					</select>
    					<input type="text" name="begin" value="${begin }"> - 
    					<input type="text" name="end" value="${end }" style="margin-right: 5px;">
    					<input type="submit" value="搜索">
    			</td>
    		</tr>
    		<tr class="title" align="center">
    			<td style="vertical-align: middle;" width="15%"><a href="javascript:del();">删除</a></td>
    			<td style="vertical-align: middle;" width="15%">车次</td>
    			<td style="vertical-align: middle;" width="20%">发车--到达</td>
    			<td style="vertical-align: middle;" width="20%">发时--到时</td>
    			<td style="vertical-align: middle;" width="15%">车型</td>
    			<td style="vertical-align: middle;" width="15%">运行时间</td>
    		</tr>
    		<c:forEach items="${list }" var="trainInfo" varStatus="status">
    			<tr align="center" style="background-color: ${status.count%2 == 0?'#F0F0F0':''}">
    				<td><input type="checkbox" value="${trainInfo.trainNo }" name="trainNo"/></td>
    				<td><a href="TrainInfoDataServlet?trainNo=${trainInfo.trainNo }">${trainInfo.trainNo }</a></td>
    				<td>${trainInfo.startStation }--${trainInfo.arrivalStation }</td>
    				<td>${trainInfo.startTime }--${trainInfo.arrivalTime }</td>
    				<td>${trainInfo.type }</td>
    				<td>${trainInfo.runtime }</td>
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
    	</form>
    </div>
  </body>
</html>
