<%@ page session="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta charset="utf-8" />
<title>Home</title>
</head>
<body>
	<form action="/spring/login" method="post"
		enctype="application/x-www-form-urlencoded">
		<label for="id">ID: <input type="text" name="id" value="${id}" /></label>
		<br> <label for="pw">PW: <input type="text" name="pw" /></label>
		<br> <input type="submit" value="전송" />
	</form>

</body>
</html>