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
import co.grandcircus.MovieAPi.Model.Genres;
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
//		Integer page = 2;
		List<Movie> movieList = apiService.movieList();
		List<Genres> genreList = apiService.genreList();
		System.out.println(genreList);
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("genres", genreList);
		mav.addObject("movies",movieList);
//		return new ModelAndView("index", "movies", movieList);
		return mav;
	}
//	@RequestMapping("/")
//	public ModelAndView home() {
//		Integer page = 2;
//		List<Movie> movieList = apiService.movieList(page);
//		return new ModelAndView("index", "movies", movieList);
//	}
	@PostMapping("/")
	public ModelAndView criteriaPage(
			@RequestParam(value = "releaseYear", required = false) Integer releaseYear,
			@RequestParam(value = "sort", required = false) String sort,
			@RequestParam(value = "genreId", required = false) Integer genreId,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "movieId", required = false) Integer movieId,
			@RequestParam(value = "title", required = false) String title,
			@RequestParam(value = "genreName", required = false) String genreName
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
			favorite.setTitle(title);
			favoritesDao.create(favorite);
		}
//		Integer releaseYear = 2011;
//		Boolean adult = false;
//		Integer page = 2;
//		Integer genreId = 18;
		List<Movie> movieList;
		if(genreId!=null) {
		movieList = apiService.movieCriteria(releaseYear,genreId,sort);
		}else if (sort!=null){
			movieList = apiService.movieCriteria(releaseYear,sort);
		}else {
			sort="primary_release_date.asc";
			movieList = apiService.movieCriteria(releaseYear,sort);
		}
		List<Genres> genreList = apiService.genreList();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("genres", genreList);
		mav.addObject("movies",movieList);
		return mav;
	}
	
	
	@RequestMapping("/details")
	public ModelAndView details(
			@RequestParam("id") Integer id
			) {
//		Integer id = 550;
		MovieDetail details = apiService.movieDetail(id);
		return new ModelAndView("Details","details", details);
	}
	
	@RequestMapping("/favorites")
	public ModelAndView favoritesPage() {
		ModelAndView mav = new ModelAndView("Favorites");
		List<Favorite> favoritesList = favoritesDao.findAll();
		mav.addObject("favoritesList", favoritesList);
		
		
		return mav;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(
			@RequestParam("id") Long id
			) {
		favoritesDao.delete(id);
		
		ModelAndView mav = new ModelAndView("Favorites");
		List<Favorite> favoritesList = favoritesDao.findAll();
		mav.addObject("favoritesList", favoritesList);
		
		
		return mav;
	}
	
}
