<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<link rel="stylesheet" href="themes/<spring:theme code='stylesheet'/>" type="text/css" />
</head>
<body>
	<h1>Your name is : ${yourName}</h1>	
	<h1>Your surname is: ${yourSurname}</h1>
</body>
</html>