package co.grandcircus.MovieAPi.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {

	private Integer id;
	private String title;
	@JsonProperty("original_language")
	private String origLanguage;
	private Double popularity;
	@JsonProperty("poster_path")
	private String postPath;
	@JsonProperty("genre_ids")
	List<Integer> genreIds;
	private Boolean adult;
	private String overview;
	@JsonProperty("release_date")
	private String releaseDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOrigLanguage() {
		return origLanguage;
	}
	public void setOrigLanguage(String origLanguage) {
		this.origLanguage = origLanguage;
	}
	public Double getPopularity() {
		return popularity;
	}
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	public String getPostPath() {
		return postPath;
	}
	public void setPostPath(String postPath) {
		this.postPath = postPath;
	}
	public List<Integer> getGenreIds() {
		return genreIds;
	}
	public void setGenreIds(List<Integer> genreIds) {
		this.genreIds = genreIds;
	}
	public Boolean getAdult() {
		return adult;
	}
	public void setAdult(Boolean adult) {
		this.adult = adult;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", origLanguage=" + origLanguage + ", popularity=" + popularity
				+ ", postPath=" + postPath + ", genreIds=" + genreIds + ", adult=" + adult + ", overview=" + overview
				+ ", releaseDate=" + releaseDate + "]";
	}
	
}
