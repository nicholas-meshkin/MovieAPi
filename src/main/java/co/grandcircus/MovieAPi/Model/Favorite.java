package co.grandcircus.MovieAPi.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="favorites")
public class Favorite {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Integer movieId;
	private String title;
	
	
	
	
public Favorite() {}

	public Favorite(Long id, Integer movieId, String title) {
		super();
		this.id = id;
		this.movieId = movieId;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	@Override
	public String toString() {
		return "Favorite [id=" + id + ", movieId=" + movieId + ", title=" + title + "]";
	}
	
	
	
	


}
