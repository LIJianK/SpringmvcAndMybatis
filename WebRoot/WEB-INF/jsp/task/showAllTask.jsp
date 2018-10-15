<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${taskList}" var="task">
		${task.taskId}--${task.taskContent}--${task.taskBeginTime}<br/>
	</c:forEach>
	<hr/>
	删除
	<form action="${pageContext.servletContext.contextPath }/task/deleteTask">
		Id<input type="text" name="taskId"/>
		<input type="submit" value="delete"/>
	</form>
	<hr/>
	<a href="${pageContext.servletContext.contextPath }/task/toFromAdd">添加</a><br>
	<a href="${pageContext.servletContext.contextPath }/task/toFromUpdate">修改</a>
</body>
</html>