 package co.grandcircus.MovieAPi;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.MovieAPi.Model.Genres;
import co.grandcircus.MovieAPi.Model.Movie;
import co.grandcircus.MovieAPi.Model.MovieDetail;
import co.grandcircus.MovieAPi.Model.MovieResponse;

@Component
public class ApiService {

	@Value("${myapi.key}")
	String myApiKey;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public List<Movie> movieList() {
		String url = "https://api.themoviedb.org/3/discover/movie?sort_by=primary_release_date.asc&api_key=" + myApiKey;
		MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);
		return response.getResults();
	}
	public List<Movie> movieList(Integer page) {
		String url = "https://api.themoviedb.org/3/discover/movie?sort_by=primary_release_date.asc&api_key=" + myApiKey + "&page=" + page;
		MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);
		return response.getResults();
	}
	
	
	public List<Genres> genreList(){
		String url = "https://api.themoviedb.org/3/genre/movie/list?api_key="+ myApiKey+"&language=en-US";
		MovieDetail movieDetail = restTemplate.getForObject(url, MovieDetail.class);
		return movieDetail.getGenres();
		}
	
	public MovieDetail movieDetail(Integer id) {
		String url = "https://api.themoviedb.org/3/movie/" + id + "?api_key=" +myApiKey;
		MovieDetail response2 = restTemplate.getForObject(url, MovieDetail.class);
		return response2;
	}
	
	public List<Movie> movieCriteria(Integer releaseYear, Integer genreId, Integer page, String sort){
		
		String url = "https://api.themoviedb.org/3/discover/movie?&api_key=" + myApiKey +"&primary_release_year="+releaseYear+"&with_genres="+genreId+"&sort_by="+sort+ "&page=" + page;
		MovieResponse response3 = restTemplate.getForObject(url, MovieResponse.class);
		return response3.getResults();
	}
}
