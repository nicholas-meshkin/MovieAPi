<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<div class="container">
	<h1>Movie List App</h1>
	<form method="post">
	<p>
			<label for="releaseYear">Release Year:</label> <input class="inputbox" type="number"
				id="releaseYear" name="releaseYear" min=1874 max=2026 value="${param.releaseYear}"/>
		
			<label for="genreId">Genre:</label> <select class="inputbox" id="genreId"
				name="genreId"> <!-- value="${param.genreId }" -->
				<option value="${param.genreId}"></option>
				<c:forEach var="genre" items="${genres }">
				<option value="${genre.id }">${genre.name}</option>
				</c:forEach>
			</select>
		
			<label for="sort">Sort By:</label> <select class="inputbox" id="sort"
				name="sort"> <!-- value="${param.genreId }" -->
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
		
			<label for="page">Page:</label> <input class="inputbox" type="number"
				id="page" name="page" min=1 max=20000 value="${param.page}"/>
		</p>
		<!-- <p>
			<label for="adult">Adult:</label> <select class="inputbox" id="adult"
				name="adult">
			<option value="false">No</option>
			<option value="true">Yes</option>
			</select>
		</p> -->
		<br>
		
		
		<p>
			<button>Submit</button>
		</p>
	</form>
	

		<table>
			<tr>
				<th>Title</th>
				<th>Release Date</th>
				<th>Popularity</th>
			</tr>

			<c:forEach var="movie" items="${ movies }">

				<tr>
					<td>${ movie.title }</td>
					<td>${ movie.releaseDate }</td>
					<td>${ movie.popularity }</td>
					<td>
					<form method= "post">
							<input name="movieId" type="hidden" value="${ movie.id }">
							<input name="title" type="hidden" value="${ movie.title }">
							<input name="genreId" type="hidden" value="${ param.genreId }">
							<input name="releaseYear" type="hidden" value="${ param.releaseYear }">
							<input name="sort" type="hidden" value="${ param.sort }">
							<input name="page" type="hidden" value="${param.page }">
							<button>Add Favorite</button>
					</form>
					
					</td>
					
					<td>
					<form action="/details">
							<input name="id" type="hidden" value="${ movie.id }">
							<button>Details</button>
					</form>
					<!--  < a href="/?id=${movie.id }&releaseYear=${param.releaseYear }" -->
					</td>
				</tr>

			</c:forEach>
		</table>
		<br>
		<a href = "/favorites">Favorites</a>
		<a href="/">Clear Search</a>

	</div>


	"This product uses the TMDb API but is not endorsed or certified by
	TMDb."
</body>
</html>