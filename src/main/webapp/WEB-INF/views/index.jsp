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

<table>

<tr>
<th>Title</th><th>Release Date</th><th>Popularity</th>
</tr>

<c:forEach var="movie" items="${ movies }">

<tr>
<td>${ movie.title }</td>
<td>${ movie.releaseDate }</td>
<td>${ movie.popularity }</td>
<td><form action="/details">
<input name="id" type="hidden"  value="${ movie.id }">
<button >Details</button>
</td>
</form>
</tr>

</c:forEach>
</table>

</div>


"This product uses the TMDb API but is not endorsed or certified by TMDb."
</body>
</html>