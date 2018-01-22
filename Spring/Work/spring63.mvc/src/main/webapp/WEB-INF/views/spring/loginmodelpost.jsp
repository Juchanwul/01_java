<%@ page session="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta charset="utf-8" />
<title>Home</title>
</head>
<body>
	<h2>이름 : ${info.name }</h2>
	<h2>폰 : ${info.phone }</h2>
</body>
</html>