<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Favorites Page</title>
</head>
<body>
	<div class="container">
	<table>
	<tr>
	<th>Number</th><th>Title</th>
	</tr>
		<c:forEach var="movie" items="${ favoritesList }">
		<tr>
				<td>${ movie.id }</td>
				<td>${ movie.title }</td>
				<td>
					<form action="/details">
							<input name="id" type="hidden" value="${ movie.movieId }">
							<button>Details</button>
					</form>
					</td>
		</tr>
		</c:forEach>
</table>
	<a href="/">Home</a>
	</div>
</body>
</html>