<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<c:url value="/themes" var="themeURLBase"/>	
	<link rel="stylesheet" href="${themeURLBase}/<spring:theme code='stylesheet'/>" type="text/css" />
</head>
<body>
	<div class="Headline">
	Home
		<div class="SubHeadline">
		There is no place like home.
		</div>	
	</div>	
	You can:
	<ol>
		<c:url value="/user/list" var="ShowUsersURL" />
		<c:url value="/products" var="ShowProductsURL" />
		
		<li><a href="${ShowUsersURL}">List users</a></li>
		<li><a href="${ShowProductsURL}">List products</a></li>		
	</ol>
</body>
</html>