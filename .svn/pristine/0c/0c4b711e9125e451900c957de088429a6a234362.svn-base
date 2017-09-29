<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<c:url value="/themes" var="themeURLBase"/>	
	<link rel="stylesheet" href="${themeURLBase}/<spring:theme code='stylesheet'/>" type="text/css" />
</head>
<body>
	<div class="Headline">
	Add product
		<div class="SubHeadline">
		Go ahead and add a product, will you?
		</div>	
	</div>
	
	<c:url value="/products/create" var="AddProductURL"/>
	<form action="${AddProductURL}" method="post">
		<label for="name">Name</label>
		<input typt="text" id="name" name="name"/>
		<input type="submit" value="add" />
	</form>	
</body>
</html>