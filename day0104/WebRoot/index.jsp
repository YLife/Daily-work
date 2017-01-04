<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/styles.css" />
<style>
form>div {
	margin-bottom: 15px;
}

label {
	display: block;
	margin-bottom: 8px;
}
</style>
</head>

<body>
	<%!String get(Cookie[] cookies , String name){
		if(cookies != null){
			for(Cookie cookie:cookies){
				if(name.equals(cookie.getName())){
					return cookie.getValue();
				}
			}
		}
		return null;
	}
		
	%>
	<%
		Cookie[] cookies = request.getCookies();
		String user = get(cookies , "user");
		String pwd = get(cookies , "pwd");
		// 模拟数据库
		Map<String, String> map = new HashMap<String, String>();
		map.put("taylor", "123");
		map.put("miss", "456");
		// 身份校验
		String val = map.get(user);
		if (val != null && val.equals(pwd)) {
			session.setAttribute("currentUser", user);
			response.sendRedirect("main.jsp");
		} else {
			out.print("cookie已过期。请重新登录。");
			%>
				<a href="index.jsp">返回</a>
			<%
		}
		
	%>
	<div class="container">
		<form action="login.jsp" method="post" class="form-horizontal">
			<div>
				<label for="">用户名：</label> <input type="text" name="user" placeholder="user"/>
			</div>
			<div>
				<label for="">密码：     </label><input type="password" name="pwd" placeholder="password"/>
			</div>
			<div>
				<label> <input type="checkbox" name="remember" value="yes" />
					记住密码
				</label>
			</div>
			<div>
				<button>登录</button>
			</div>
		</form>
	</div>
</body>
</html>
