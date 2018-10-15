<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	修改
		<form action="${pageContext.servletContext.contextPath }/task/updateTask" method="post">
			ID<input type="text" name="taskId">
			<br />
			任务名称<input type="text" name="taskContent">
			<br />
			任务开始时间<input type="text" name="taskBeginTime">
			<br />
			<input type="submit" value="update">
		</form>
</body>
</html>