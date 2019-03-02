<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css">
<title>Home</title>

</head>
<body>

	<div class="container">
	<h1>Movie List App</h1>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	<form method="post">
	<span class="nav-item">
			<label class="h4 mr-1" for="releaseYear">Release Year:</label> <input class="inputbox" type="number"
				id="releaseYear" name="releaseYear" min=1874 max=2026 value="${param.releaseYear}"/>
				</span>
		<span class="nav-item">
			<label class="h4 ml-4 mr-1" for="genreId">Genre:</label> <select class="inputbox" id="genreId"
				name="genreId">
				<option value="${param.genreId}"></option>
				<c:forEach var="genre" items="${genres }">
				<option value="${genre.id }">${genre.name}</option>
				</c:forEach>
				
			</select>
			</span>
		<span class="nav-item">
			<label class="h4 ml-4 mr-1" for="sort">Sort By:</label> <select class="inputbox" id="sort"
				name="sort"> 
				<option value="${param.sort}"></option>
				<option value="vote_average.asc">Vote Average Asc</option>
				<option value="vote_average.desc">Vote Average Desc</option>
				<option value="popularity.asc">Popularity Asc</option>
				<option value="popularity.desc">Popularity Desc</option>
				<option value="primary_release_date.asc">Release Date Asc</option>
				<option value="primary_release_date.desc">Release Date Desc</option>
				<option value="revenue.asc">Revenue Asc</option>
				<option value="revenue.desc">Revenue Desc</option>
			</select>
			</span>
			
		<span class="nav-item">
			<label class="h4 ml-4 mr-1" for="page">Page:</label> <input class="inputbox" type="number"
				id="page" name="page" min=1 max=20000 value="${param.page}"/>
				
				<button class="btn btn-secondary ml-4">Submit</button>
		</span>
	</form>
	</nav>

		<table class= "table">
			<tr class="table-secondary">
				<th class= "h3">Title</th>
				<th class= "h3">Release Date</th>
				<th class= "h3">Popularity</th>
				<th class="h3"></th>
				<th class="h3"></th>
			</tr>

			<c:forEach var="movie" items="${ movies }">

				<tr class="table-success">
					<td class= "h4">${ movie.title }</td>
					<td class= "h4">${ movie.releaseDate }</td>
					<td class= "h4">${ movie.popularity }</td>
					<td>
					<form method= "post">
							<input name="movieId" type="hidden" value="${ movie.id }">
							<input name="title" type="hidden" value="${ movie.title }">
							<input name="genreId" type="hidden" value="${ param.genreId }">
							<input name="releaseYear" type="hidden" value="${ param.releaseYear }">
							<input name="sort" type="hidden" value="${ param.sort }">
							<input name="page" type="hidden" value="${param.page }">
							<button class="btn btn-primary">Add Favorite</button>
					</form>
					</td>
					<td>
					<form action="/details">
							<input name="id" type="hidden" value="${ movie.id }">
							<button class="btn btn-primary">Details</button>
					</form>
					</td>
				</tr>

			</c:forEach>
		</table>
		<br>
		<a class="mr-4" href = "/favorites">Favorites</a>
		<a href="/">Clear Search</a>
		<br>

	<p>
	"This product uses the TMDb API but is not endorsed or certified by
	TMDb."
	</p>
	</div>

</body>
</html>