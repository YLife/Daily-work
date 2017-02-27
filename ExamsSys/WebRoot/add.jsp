<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/styles.css">
	<style type="text/css">
		label {
			position: relative;
			bottom: 20px;
		}
		.bottom{
			font-size: 16px;
			font-weight: bold;
			float: right;
		}
	</style>
	<script type="text/javascript">
		function reset() {
			window.location.href = "QuestionAddServlet";
		}
	</script>
  </head>
  
  <body>
    <div class="container2">
    <form action="DoQuestionAddServlet" method="post">
    	<table class="table table-bordered">
    		<tr>
    			<td align="center"><span style="font-weight: bold; font-size: 20px;">试题信息</span></td>
    		</tr>
    		<tr>
    			<td>
    				<label>题干：</label>
    				<textarea rows="2" cols="75" name="question" id="question"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				<label style="position: static;">选项：</label>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				 <label>A、</label>
    				 <textarea rows="2" cols="75" name="option_a" id="option_a"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				<label>B、</label>
    				<textarea rows="2" cols="75" name="option_b" id="option_b"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				<label>C、</label>
    				<textarea rows="2" cols="75" name="option_c" id="option_c"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				<label>D、</label>
    				<textarea rows="2" cols="75" name="option_d" id="option_d"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    			<label style="position: static;">科目：</label>
    			<select name="subjectId" id="subject">
    				<option value="">请选择</option>
    				<c:forEach items="${list }" var="s">
    				<option value="${s.subjectId }"> ${s.subjectName }</option>
    			</c:forEach>
    			</select>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				<label style="position: static;">正确答案：</label>
 					<input type="text" name="answer">
    			</td>
    		</tr>
    		<tr>
    			<td class="text-center">
    				<input type="submit" value="增加">
    				<input type="button" value="重置" onclick="reset();">
    			</td>
    		</tr>
    	</table>
    	</form>
    	<div class="bottom"><a href="QuestionServlet">查询试题</a></div>
    </div>
  </body>
</html>
