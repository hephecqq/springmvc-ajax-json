<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript" src="jquery.min.js"></script>

	用户名：
	<input type="text" id="txtName" name="username" />
	<script type="text/javascript">
		$(function() {
			$("#txtName").blur(function() {
				$.post("ajax", {
					'name' : $('#txtName').val()
				}, function(data) {
					alert(data);
				})
			})
		})
	</script>
</body>
</html>