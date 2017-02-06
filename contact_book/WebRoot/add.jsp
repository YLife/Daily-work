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
	<link rel="stylesheet" href="css/bootstrap.css" />
	<link rel="stylesheet" href="css/styles.css" />
	<script type="text/javascript">
		function check() {
			var contactName = document.getElementById("contactName").value;
			var contactPhone = document.getElementById("contactPhone").value;
			var contactMail = document.getElementById("contactMail").value;
			var relation = document.getElementById("relation").value;
			if (contactName.length <= 0) {
				alert("姓名不能为空");
				return false;
			}
			if (contactPhone.length <= 0) {
				alert("电话不能为空");
				return false;
			}
			var reg = /^\w+@\w+\.(\w+){1,2}$/;
			if (!reg.test(contactMail)) {
				alert("邮箱格式不正确");
				return false;
			}
			if (relation == 0) {
				alert("请选择关系类型");
				return false;
			}
			return true;
		}
	</script>
  </head>

<body>
	<div class="container1">
		<form action="add.action" method="post" onsubmit="return check()">
			<table class="table table-bordered">
				<tr style="height: 50px;text-align: center;">
					<td><span style="font-size: 20px;font-weight: bold;">新增联系人</span></td>
				</tr>
				<tr>
					<td><label>姓名</label> <input type="text" name="contactName" id="contactName">
					</td>
				</tr>
				<tr>
					<td><label>电话</label> <input type="text" name="contactPhone" id="contactPhone">
					</td>
				</tr>
				<tr>
					<td><label>邮箱</label> <input type="text" name="contactMail" id="contactMail">
					</td>
				</tr>
				<tr>
					<td><label>关系</label> <select name="relation" id="relation">
							<option value="0">请选择关系类型</option>
							<option value="家人">家人</option>
							<option value="同事">同事</option>
							<option value="朋友">朋友</option>
							<option value="同学">同学</option>
							<option value="其它">其它</option>
					</select></td>
				</tr>
				<tr>
					<td class="text-center"><input type="submit" name="submit"
						value="增加联系人"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
