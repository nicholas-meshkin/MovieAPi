<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movies</title>
</head>
<body>
<div class="container">
	<p>Title: ${ details.title }</p>

	<p>Overview: <br> ${ details.overview }</p>

	<p>Popularity: ${ details.popularity }</p>

	<p>
		Production countries:<br>
		<c:forEach var="pCountries" items="${ details.pCountries }">
 			${ pCountries.name } <br>
		</c:forEach>
	</p>

	<p>Release date: ${ details.releaseDate }</p>

	<p>Budget:$ ${ details.budget }</p>
	<p>Revenue:$ ${ details.revenue }</p>

	<p>Runtime: ${ details.runtime } minutes</p>

	<p>Spoken languages:<br>
	<c:forEach var="sLanguages" items="${ details.sLanguages }">
 			${ sLanguages.name } <br>
		</c:forEach>
		</p>

	<p>Status: ${ details.status }</p>

	<p>Tagline:"${ details.tagline }"</p>

	<p>Vote average: ${ details.voteAverage }</p>

	<p>Vote count: ${ details.voteCount }</p>
</div>
</body>
</html>