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

	<p>Title: ${ details.title }</p>

	<p>overview: ${ details.overview }</p>

	<p>popularity: ${ details.popularity }</p>

	<p>
		production countries:<br>
		<c:forEach var="pCountries" items="${ details.pCountries }">
 			${ pCountries.name } <br>
		</c:forEach>
	</p>

	<p>release date: ${ details.releaseDate }</p>

	<p>revenue: ${ details.revenue }</p>

	<p>runtime: ${ details.runtime }</p>

	<p>spoken languages:<br>
	<c:forEach var="sLanguages" items="${ details.sLanguages }">
 			${ sLanguages.name } <br>
		</c:forEach>
		</p>

	<p>status: ${ details.status }</p>

	<p>tagline: ${ details.tagline }</p>

	<p>vote average: ${ details.voteAverage }</p>

	<p>vote count: ${ details.voteCount }</p>

</body>
</html>