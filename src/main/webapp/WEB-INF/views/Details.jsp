<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css">
<title>Movies</title>
</head>
<body>
<div class="container">
<h2 class="font-weight-bold">Movie Details</h2>
<br>

	<p class="h2" ><strong>Title:</strong> ${ details.title }</p>

	<p><strong>Overview:</strong> <br> ${ details.overview }</p>

	<table class="table">
	
	
	<tr>
	<td><strong>Popularity:</strong></td>
	<td> ${ details.popularity }</td>
</tr>

<tr>
	<td><strong>Production countries:</strong></td><br>
		<td><c:forEach var="pCountries" items="${ details.pCountries }">
 			${ pCountries.name } <br>
		</c:forEach></td>
	</tr>

<tr>
	<td><strong>Release date:</strong></td> 
	<td>${ details.releaseDate }</td>
</tr>

<tr>
	<td><strong>Budget:</strong></td>
	<td> $${details.budget }</td>
	</tr>
	
	<tr>
	<td><strong>Revenue:</strong></td>
	<td> $${ details.revenue }</td>
</tr>
<tr>
	<td><strong>Runtime:</strong></td> 
	<td> ${ details.runtime } minutes</td>
</tr>
<tr>
	<td>
	<strong>Spoken languages:</strong></td><br>
	<td><c:forEach var="sLanguages" items="${ details.sLanguages }">
 			${ sLanguages.name } <br>
		</c:forEach>
		</td>
</tr>
<tr>
	<td><strong>Status:</strong></td>
	<td> ${ details.status }</td>
</tr>
<tr>
	<td><strong>Tagline: </strong></td>
	<td>"${ details.tagline }"</td>
</tr>
<tr>
	<td><strong>Vote average:</strong></td>
	<td> ${ details.voteAverage }</td>
</tr>
<tr>
	<td><strong>Vote count:</strong></td>
	<td> ${ details.voteCount }</td>
	</tr>
	</table>
	
	
	<a class="mr-4" href = "/">Home</a>
	<a href = "/favorites">Favorites</a>
	
	<br>

	<p>
	"This product uses the TMDb API but is not endorsed or certified by
	TMDb."
	</p>
</div>
</body>
</html>