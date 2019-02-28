package co.grandcircus.MovieAPi.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDetail {

	private List<Genres> genres;
	@JsonProperty("production_countries")
	private List<ProductionCountries> pCountries;
	@JsonProperty("spoken_languages")
	private List<SpokenLanguages> sLanguages;
	private Boolean adult;
	private Integer budget;
	private String homepage;
	private Integer id;
	private String overview;
	private Double popularity;
	@JsonProperty("release_date")
	private String releaseDate;
	private Integer revenue;
	private Integer runtime;
	private String status;
	private String tagline;
	private String title;
	@JsonProperty("vote_average")
	private Double voteAverage;
	@JsonProperty("vote_count")
	private Integer voteCount;
	
	
	public List<Genres> getGenres() {
		return genres;
	}
	public void setGenres(List<Genres> genres) {
		this.genres = genres;
	}
	public List<ProductionCountries> getpCountries() {
		return pCountries;
	}
	public void setpCountries(List<ProductionCountries> pCountries) {
		this.pCountries = pCountries;
	}
	public List<SpokenLanguages> getsLanguages() {
		return sLanguages;
	}
	public void setsLanguages(List<SpokenLanguages> sLanguages) {
		this.sLanguages = sLanguages;
	}
	public Boolean getAdult() {
		return adult;
	}
	public void setAdult(Boolean adult) {
		this.adult = adult;
	}
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public Double getPopularity() {
		return popularity;
	}
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Integer getRevenue() {
		return revenue;
	}
	public void setRevenue(Integer revenue) {
		this.revenue = revenue;
	}
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(Double voteAverage) {
		this.voteAverage = voteAverage;
	}
	public Integer getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}
	@Override
	public String toString() {
		return "MovieDetail [genres=" + genres + ", pCountries=" + pCountries + ", sLanguages=" + sLanguages
				+ ", adult=" + adult + ", budget=" + budget + ", homepage=" + homepage + ", id=" + id + ", overview="
				+ overview + ", popularity=" + popularity + ", releaseDate=" + releaseDate + ", revenue=" + revenue
				+ ", runtime=" + runtime + ", status=" + status + ", tagline=" + tagline + ", title=" + title
				+ ", voteAverage=" + voteAverage + ", voteCount=" + voteCount + "]";
	}
	
	
	
	
	
	
	
	
}
