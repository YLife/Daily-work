<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.awt.Font"%>
<%@page import="java.awt.Color"%>
<%@page import="java.awt.Graphics"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'validate-image.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
    	//创建图像
    	int width = 200;
    	int height = 60;
    	BufferedImage img = new BufferedImage(width, height,
    			BufferedImage.TYPE_INT_RGB);
    	int r, g, b, x, y;

    	//画板
    	Graphics gic = img.getGraphics();

    	//画个矩形背景
    	r = (int) (Math.random() * 256);
    	g = (int) (Math.random() * 256);
    	b = (int) (Math.random() * 256);
    	gic.setColor(new Color(r, g, b));
    	gic.fillRect(0, 0, width, height);

    	//画500个干扰点
    	for (int i = 0; i < 500; i++) {
    		r = (int) (Math.random() * 256);
    		g = (int) (Math.random() * 256);
    		b = (int) (Math.random() * 256);
    		x = (int) (Math.random() * width);
    		y = (int) (Math.random() * height);
    		gic.setColor(new Color(r, g, b));
    		gic.fillRect(x, y, 2, 2);
    	}
    	
    	//写字
    	String strings = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    	String code = "";
    	for( int i = 0 ; i < 4 ; i++){
    		int num = (int) (Math.random() * strings.length());
    		code += strings.charAt(num);
    	}
    	
    	//使用session记住字符
    	session.setAttribute("code", code);
    	
    	r = (int) (Math.random() * 256);
    	g = (int) (Math.random() * 256);
    	b = (int) (Math.random() * 256);
    	gic.setColor(new Color(r , g , b));
    	gic.setFont(new Font("Arial" , Font.BOLD , 30));
    	gic.drawString(code, 50, 45);
    	
    	//保存图像
    	ImageIO.write(img, "jpg", response.getOutputStream());
    	out.close();
    %>
  </body>
</html>
