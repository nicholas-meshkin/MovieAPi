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
	
	<form method="post">
	<p>
			<label for="releaseYear">Release Year:</label> <input class="inputbox" type="number"
				id="releaseYear" name="releaseYear" value="${param.releaseYear}"/>
		</p>
		
		<p>
			<label for="genreId">Genre:</label> <select class="inputbox" id="genreId"
				name="genreId"> <!-- value="${param.genreId }" -->
				<option value=""></option>
			<option value="28">Action</option>
			<option value="12">Adventure</option>
			<option value="16">Animation</option>
			<!-- TODO: finish list of genres (going to use api to populate list -->
			</select>
		</p>
		
		<p>
			<label for="adult">Adult:</label> <select class="inputbox" id="adult"
				name="adult">
			<option value="false">No</option>
			<option value="true">Yes</option>
			</select>
		</p>
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
					<form action="/details">
							<input name="id" type="hidden" value="${ movie.id }">
							<button>Details</button>
					</form>
					< a href="/?id=${movie.id }&releaseYear=${param.releaseYear }"
					</td>
				</tr>

			</c:forEach>
		</table>

	</div>


	"This product uses the TMDb API but is not endorsed or certified by
	TMDb."
</body>
</html>