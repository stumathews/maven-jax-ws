<%@page import="BOL.Authentication"%>
<%@page import="DAL.Token"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<link rel="stylesheet" href="themes/<spring:theme code='stylesheet'/>" type="text/css" />
	<link rel="stylesheet" type="text/css" media="all" href="themes/grid960/reset.css" />
 	<link rel="stylesheet" type="text/css" media="all" href="themes/grid960/text.css" />
 	<link rel="stylesheet" type="text/css" media="all" href="themes/grid960/960.css" />
 	<link rel="stylesheet" type="text/css" media="all" href="themes/default.css"/>
</head>
<body>
	<!-- Allow the user to input user details -->
	<c:url value="/user/create" var="loginUrl"/>
	
	<form action="${loginUrl}" method="post">
		<label for="username">User name</label>
		<input type="text" id="username" name="username"><br/>
		<label for="password">Password</label>
		<input type="text" id="password" name="password">
		<input type="submit" name="submit" type="submit" value="login">		
	</form>
</body>
</html>