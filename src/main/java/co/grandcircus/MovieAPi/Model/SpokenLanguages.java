package co.grandcircus.MovieAPi.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpokenLanguages {
	
	@JsonProperty("iso_639_1")
	private String languageAbv;
	private String name;
	
	
	public String getLanguageAbv() {
		return languageAbv;
	}
	public void setLanguageAbv(String languageAbv) {
		this.languageAbv = languageAbv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SpokenLanguages [languageAbv=" + languageAbv + ", name=" + name + "]";
	}
	
	
	

}
