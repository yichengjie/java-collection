<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>


	<!-- form表单发送put和delete请求 -->
	<form action="rest/user/1" method="post">
		<input type="hidden" name="_method" value="PUT"> <input
			type="submit" value="put">
	</form>

	<form action="rest/user/1" method="post">
		<input type="submit" value="post">
	</form>

	<form action="rest/user/1" method="get">
		<input type="submit" value="get">
	</form>

	<form action="rest/user/1" method="post">
		<input type="hidden" name="_method" value="DELETE"> <input
			type="submit" value="delete">
	</form>

</body>
</html>