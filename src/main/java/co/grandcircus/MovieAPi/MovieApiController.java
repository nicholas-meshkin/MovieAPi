package co.grandcircus.MovieAPi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.MovieAPi.Model.Favorite;
import co.grandcircus.MovieAPi.Model.Movie;
import co.grandcircus.MovieAPi.Model.MovieDetail;
import co.grandcircus.MovieAPi.dao.FavoritesDao;

@Controller
public class MovieApiController {

	@Autowired
	private FavoritesDao favoritesDao;
	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		Integer page = 2;
		List<Movie> movieList = apiService.movieList(page);
		return new ModelAndView("index", "movies", movieList);
	}
	@PostMapping("/")
	public ModelAndView criteriaPage(
			@RequestParam(value = "releaseYear", required = false) Integer releaseYear,
			@RequestParam(value = "adult", required = false) Boolean adult,
			@RequestParam(value = "genreId", required = false) Integer genreId,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "movieId", required = false) Integer movieId
			) {
		if (movieId != null) {
			List<Favorite> faveList = favoritesDao.findAll();
			List<Integer> movieIds = new ArrayList<>();
			if (faveList != null && !faveList.isEmpty()) {
				for (int i = 0; i< faveList.size(); i++) {
					Favorite temp = faveList.get(i);
					movieIds.add(temp.getMovieId());//gets the list of Movie Ids 
				}
				if (movieIds.contains(movieId)) {
					return new ModelAndView ("redirect:/");
							///TODO add an error message, stay with same search
				}
				
			}
			Favorite favorite = new Favorite();
			favorite.setMovieId(movieId);
			favoritesDao.create(favorite);
		}
//		Integer releaseYear = 2011;
//		Boolean adult = false;
//		Integer page = 2;
//		Integer genreId = 18;
		List<Movie> movieList = apiService.movieCriteria(releaseYear, adult, genreId, page);
		return new ModelAndView("index","movies",movieList);
	}
	
	@RequestMapping("/details")
	public ModelAndView details(
			@RequestParam("id") Integer id
			) {
//		Integer id = 550;
		MovieDetail details = apiService.movieDetail(id);
		return new ModelAndView("Details","details", details);
	}
}
