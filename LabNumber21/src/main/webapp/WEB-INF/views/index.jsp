<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Tangerine">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<title>Welcome to GC Coffee!</title>

<style>
h1 {
	color: maroon;
	font-family: 'Tangerine', serif;
	font-size: 48px;
	text-shadow: 4px 4px 4px #aaa;
	font-weight: bolder;
}
</style>

</head>

<body>
	<div class="container">
		<h1>Welcome to GC COFFEE!</h1>
		<a href="/registration">Please click to register.</a> <br><br>
		<!-- ${registration} The expression tag, if included, will result in the appearance of the value in the third parameter of ModelAndView index (i.e., "Welcome") -->
		<table class="table">
			<thead>
				<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${items}">
					<tr>
						<td><a href="/items/${item.itemId}">${item.name}</a></td>
						<td>${item.description}</td>
						<td>$${item.price}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

</html>