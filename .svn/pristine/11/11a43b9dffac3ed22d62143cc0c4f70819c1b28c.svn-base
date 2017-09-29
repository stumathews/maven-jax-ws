<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<c:url value="/themes" var="themeURLBase"/>	
	<link rel="stylesheet" href="${themeURLBase}/<spring:theme code='stylesheet'/>" type="text/css" />
</head>
<body>
	<div class="Headline">
	Show users.
		<div class="SubHeadline">
		This is where we show all the users in the database.
		</div>	
	</div>
	
	<table>
		<th>Number</th>
		<th>User name</th>
		<th>Action</th>
			
		<c:forEach items="${users}" var="user" varStatus="counter">			
			<tr>
				<td><c:out value="${counter.count}"></c:out></td>
				<td><c:out value="${user.getUsername()}"></c:out></td>
				<c:url value="/user/delete/${user.getUsername()}" var="deleteURL"/>
				<td><a href="${deleteURL}"> Delete </a></td>
			</tr>
		</c:forEach>
	</table>
	<c:url value="/user/add" var="createUserURL"/>
	<a href="${createUserURL}">Create new user</a>
	
</body>
</html>