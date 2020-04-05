package com.aneesh.football.aneeshfootballmatch.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Leagues {
	
	 @JsonProperty("country_id")
    	private String countryId;
	 @JsonProperty("country_name")
		private String countryName;
	 @JsonProperty("league_id")
		private String leagueId;
	 @JsonProperty("league_name")
		private String leagueName;
		Leagues(){
			
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
		public String getLeagueId() {
			return leagueId;
		}
		public void setLeagueId(String leagueId) {
			this.leagueId = leagueId;
		}
		public String getLeagueName() {
			return leagueName;
		}
		public void setLeagueName(String leagueName) {
			this.leagueName = leagueName;
		}
		@Override
		public String toString() {
			return "Leagues [countryId=" + countryId + ", countryName=" + countryName + ", leagueId=" + leagueId
					+ ", leagueName=" + leagueName + "]";
		}

		
}
