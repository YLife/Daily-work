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
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/bootstrap.css" />
	<link rel="stylesheet" href="css/styles.css" />
	<style type="text/css">
		td{
			text-align: center;
			vertical-align: center;
		}
	</style>
  </head>
  
  <body>
   	<div class="container">
    	<table class="table table-bordered">
    		<tr style="height:30px">
    			<td colspan="5"><span style="font-size: 20px;font-weight: bold;">联系人列表</span></td>
    		</tr>
    		<tr>
    			<td colspan="5" style="text-align: right"><a href="add.jsp">新增联系人</a></td>
    		</tr>
    		<tr>
    			<td>姓名</td>
    			<td>电话</td>
    			<td>邮箱</td>
    			<td>关系</td>
    			<td>操作</td>
    		</tr>
    		<c:forEach items="${requestScope.list }" var="con" varStatus="status">
				<tr style="background-color: ${status.count%2!=0?'#ccc':''}">
					<td>${con.contactName }</td>
					<td>${con.contactPhone }</td>
					<td>${con.contactMail }</td>
					<td>${con.relation.relationId }</td>
					<td>
						<a href="ContactDelServlet?contactId=${con.contactId }" onclick="return confirm('确认删除')">删除</a>
					</td>
				</tr>
 			</c:forEach>
 			<tr>
 				<td colspan="6" class="text-center">
 					<c:if test="${currentPage <= 1  }">
 						上一页
 					</c:if>
 					<c:if test="${currentPage > 1  }">
 						<a href="ContactServlet?currentPage=${currentPage - 1 }">上一页</a>
 					</c:if>
 					<c:if test="${currentPage < totalPage  }">
 						<a href="ContactServlet?currentPage=${currentPage + 1 }">下一页</a>
 					</c:if>
 					<c:if test="${currentPage >= totalPage  }">
 						下一页
 					</c:if>
 				</td>
 			</tr>
    	</table>
    </div>
  </body>
</html>    

