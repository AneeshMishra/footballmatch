package com.aneesh.football.aneeshfootballmatch.domain.model;



import com.fasterxml.jackson.annotation.JsonProperty;



public class Country{
	
	Country(){
		
	}
	  @JsonProperty("country_id")
	private String countryId;
	  
	  @JsonProperty("country_name")
	private String countryName;
	
	
	public Country(String countryId, String countryName) {
		this.countryId=countryId;
		this.countryName= countryName;
		// TODO Auto-generated constructor stub
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}
	

}
