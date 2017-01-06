<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload.jsp' starting page</title>
    
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
    <h5>controler.jsp</h5>
    <%
    	//创建FileItemFactory对象
    	FileItemFactory factory = new DiskFileItemFactory();
    	//创建servletFileUpload对象
    	ServletFileUpload sfu = new ServletFileUpload(factory);
    	//解析form中的所有文件
    	List<FileItem> list = sfu.parseRequest(request);
    	for(FileItem item : list){
    		//文本字段的处理
    		if(item.isFormField()){
    			System.out.println(item.getString());
    		}
    		//文件字段的处理
    		else{
    			//得到客户端文件名
    			String name = item.getName();
    			//得到扩展名
    			String ex = "";
    			if(name.lastIndexOf(".") != -1){
    				ex = name.substring(name.indexOf("."));
    			}
    			//动态生成服务端文件名
    			String fileName = "" + System.currentTimeMillis() + (int)(Math.random() * 10000) + ex;
    			//构造相对路径
    			String filePath = "/files/" + fileName;
    			//得到绝对路径
    			String realPath = application.getRealPath(filePath);
    			//保存文件
    			File file = new File(realPath);
    			item.write(file);
    			System.out.println("文件已保存");
    		}
    	}
    %>
    
  </body>
</html>
