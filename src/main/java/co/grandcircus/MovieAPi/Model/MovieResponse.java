package co.grandcircus.MovieAPi.Model;

public class MovieResponse {

	private String total_results;
	private String total_pages;
	private String results;
	
//	List<Results> 
	
	public String getTotal_results() {
		return total_results;
	}
	public void setTotal_results(String total_results) {
		this.total_results = total_results;
	}
	public String getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
	public String getResults() {
		return results;
	}
	public void setResults(String results) {
		this.results = results;
	}
	
	@Override
	public String toString() {
		return "Page [total_results=" + total_results + ", total_pages=" + total_pages + ", results=" + results + "]";
	}
 
}
