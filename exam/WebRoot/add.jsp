<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  </head>
  
  <body>
    <div class="container2">
    <form action="add.action" method="post">
    	<table class="table table-bordered">
    		<tr>
    			<td align="center"><span style="font-weight: bold; font-size: 20px;">试题信息</span></td>
    		</tr>
    		<tr>
    			<td>
    				<label>题干：</label>
    				<textarea rows="2" cols="75" name="question"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				<label style="position: static;">选项：</label>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				 &nbsp&nbsp&nbsp<label>A、</label>
    				 <textarea rows="2" cols="75" name="option_a"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				&nbsp&nbsp&nbsp<label>B、</label>
    				<textarea rows="2" cols="75" name="option_b"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				&nbsp&nbsp&nbsp<label>C、</label>
    				<textarea rows="2" cols="75" name="option_c"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				&nbsp&nbsp&nbsp<label>D、</label>
    				<textarea rows="2" cols="75" name="option_d"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    			<label style="position: static;">科目：</label>
    			<select name="subject">
    				<option value="1">JSP</option>
    				<option value="2">OOP</option>
    				<option value="3">JavaScript</option>
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
    				<input type="submit" value="重置">
    			</td>
    		</tr>
    	</table>
    	</form>
    	<div class="bottom"><a href="questions.action">查询试题</a></div>
    </div>
  </body>
</html>
