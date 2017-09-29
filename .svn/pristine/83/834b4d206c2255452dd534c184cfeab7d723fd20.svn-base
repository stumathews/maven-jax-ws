<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<c:url value="/themes" var="themeURLBase"/>	
	<link rel="stylesheet" href="${themeURLBase}/<spring:theme code='stylesheet'/>" type="text/css" />
</head>
<body>
	<div class="Headline">
	Products
		<div class="SubHeadline">
		These are the products currently in the database.
		</div>	
	</div>	
	<table>
		<th>Product ID</th>
		<th>Product Name</th>
		<th>Action</th>
		<c:forEach items="${products}" var="product" varStatus="counter">
			<tr>
				<td><c:out value="${product.getId()}"></c:out>				
				<td><c:out value="${product.getName()}"></c:out></td>
				<c:url var="DeleteURL" value="/products/delete/${product.getId()}"/>
				<td><a href="${DeleteURL}">Delete</a></td>				
			</tr>
		</c:forEach>
		
	</table>
	<c:url value="/products/add" var="AddProductsURL" />
	<a href="${AddProductsURL}">Add new product</a>
	
</body>
</html>