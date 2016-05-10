<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<input type="button" value="获取数据" id="txtJson"/>
<script type="text/javascript">
		$(function() {
			$("#txtJson").click(function() {
				$.post("json", {}, function(data) {
					for(var i=0;i<data.length;i++){
						alert(data[i].id);
						alert(data[i].name);
						alert(data[i].age);
						
					}
				})
			})
		})
	</script>
</body>
</html>