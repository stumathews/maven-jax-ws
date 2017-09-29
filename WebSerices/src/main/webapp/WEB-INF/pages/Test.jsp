<%@page import="BOL.Authentication"%>
<%@page import="DAL.Token"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	
	<link rel="stylesheet" type="text/css" media="all" href="themes/grid960/reset.css" />
 	<link rel="stylesheet" type="text/css" media="all" href="themes/grid960/text.css" />
 	<link rel="stylesheet" type="text/css" media="all" href="themes/grid960/960.css" />
 	<link rel="stylesheet" type="text/css" media="all" href="themes/default.css"/>
 	<link rel="stylesheet" href="themes/<spring:theme code='stylesheet'/>" type="text/css" />
  
</head>
<body>	
	<div id="BorderLayout">
			<div class="container_12">
				<div class="grid_12"></div>
		 		<div class="grid_4">
		 			Tokens in the database:
		 			<table class="table">
		 			
		 			<c:forEach var="token" items="${tokens}" varStatus="counter">
		 			<tr>
		 				<td><c:out value="${counter.count}"/></td>
		 				<td><c:out value="${token.getToken()}"/></td>
		 				<td><c:out value="${token.getIssued_time()}"/></td>	
		 			</tr>	 			
		 			</c:forEach>
		 			
		 			</table>
		 		</div>
		 		<div class="grid_4">
					<c:url value="/themes/" var="themeBASE"/>
					<div id="logo"/>
						<img src="${themeBASE}/logo.png"/>
					</div>
				</div>
		 		<div class="grid_4">
		 			<p></p>
		 		</div>
			</div>
		</div>
</body>
</html>