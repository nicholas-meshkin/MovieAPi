 package co.grandcircus.MovieAPi;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.MovieAPi.Model.Movie;
import co.grandcircus.MovieAPi.Model.MovieDetail;
import co.grandcircus.MovieAPi.Model.MovieResponse;

@Component
public class ApiService {

	@Value("${myapi.key}")
	String myApiKey;
	
	private RestTemplate restTemplate = new RestTemplate();
	public List<Movie> movieList(Integer page) {
		String url = "https://api.themoviedb.org/3/discover/movie?sort_by=primary_release_date.asc&api_key=" + myApiKey + "&page=" + page;
		MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);
		return response.getResults();
	}
	
	public MovieDetail movieDetail(Integer id) {
		String url = "https://api.themoviedb.org/3/movie/" + id + "?api_key=" +myApiKey;
		MovieDetail response2 = restTemplate.getForObject(url, MovieDetail.class);
		return response2;
	}
	
	
}
