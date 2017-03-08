<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ognl.jsp' starting page</title>
    
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
    <s:property value="str"/><br>
    <s:property value="#request.str"/><br>
    <s:property value="#attr.str"/>
    <s:property value="#parameters.id"/>
    <s:property value="#str"/><br>
    
    <%
    	Enumeration em = request.getAttributeNames();
    	while(em.hasMoreElements()){
    		out.print(em.nextElement() + "<br>");
    	}
    	ValueStack vs = (ValueStack)request.getAttribute("struts.valueStack");
    	vs.push("hello world");
    	List list = new ArrayList();
    	list.add("aaa");
    	list.add("bbb");
    	list.add("ccc");
    	list.add("ddd");
    	vs.push(list);
    	vs.push("cccc");
    	request.setAttribute("reqList", list);
    %>
    <s:property/>
    <s:iterator>
    	<s:property/>
    </s:iterator>
    <hr/>
    <s:iterator value="#request.reqList" var="str1">
    	<s:property value="str1"/>
    </s:iterator>
    <s:iterator value="mList" var="str">
    	<s:property value="#str"/>
    </s:iterator>
  </body>
</html>
