<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css">
<title>Favorites Page</title>
</head>
<body>
	<div class="container">
	<h2>My Favorites</h2>
	<br>
	<table class="table">
	<tr class="table-secondary">
	<th class="h3">Title</th>
	<th class="h3"></th>
	<th class="h3"></th>
	</tr>
		<c:forEach var="movie" items="${ favoritesList }">
		<tr class="table-success">
				
				<td class="h4">${ movie.title }</td>
				<td>
					<form action="/details">
							<input name="id" type="hidden" value="${ movie.movieId }">
							<button class="btn btn-secondary ml-4">Details</button>
					</form>
					</td>
				<td>
					<form action="/delete">
							<input name="id" type="hidden" value="${ movie.id }">
							<button class="btn btn-secondary ml-4">Delete</button>
					</form>
				</td>	
		</tr>
		</c:forEach>
</table>
	<a href="/">Home</a>
	<br>
	<p>
	"This product uses the TMDb API but is not endorsed or certified by
	TMDb."
	</p>
	</div>
</body>
</html>