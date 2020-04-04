package com.aneesh.football.aneeshfootballmatch.domain.model;

import java.util.ArrayList;
import java.util.List;

public class CountryDto {
	
	   private List<Country> country;
	   
	   CountryDto(){
		   this.country= new ArrayList<>();
	   }

	public List<Country> getCountry() {
		return country;
	}

	public void setCountry(List<Country> country) {
		this.country = country;
	}
	   
}
