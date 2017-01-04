<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	

  </head>
  
  <body>
    <%
    	String user = request.getParameter("user");
    	String pwd = request.getParameter("pwd");
    	//模拟数据库
    	Map<String , String> map = new HashMap<String , String>();
    	map.put("taylor", "123");
    	map.put("miss", "456");
    	String account = map.get(user);
    	if(account != null && account.equals(pwd)){
    		session.setAttribute("currentUser", user);
    		if("yes".equals(request.getParameter("remember"))){
    			Cookie ckUser = new Cookie("user",user);
    			ckUser.setMaxAge(360*24*60*60);
    			Cookie ckPwd = new Cookie("pwd" , pwd);
    			ckPwd.setMaxAge(360*24*60*60);
    			response.addCookie(ckUser);
    			response.addCookie(ckPwd);
    		}
    		response.sendRedirect("main.jsp");
    	}else{
    		out.print("登录失败");
    		%>
    		<a href="index.jsp">返回</a>
    		<%
    	}
    %>
  </body>
</html>
