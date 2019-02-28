package co.grandcircus.MovieAPi.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductionCountries {
	
	@JsonProperty("iso_3166_1")
	private String countryAbv;
	private String name;
	
	
	public String getCountryAbv() {
		return countryAbv;
	}
	public void setCountryAbv(String countryAbv) {
		this.countryAbv = countryAbv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ProductionCountries [countryAbv=" + countryAbv + ", name=" + name + "]";
	}
	
	
	
	
	


}
