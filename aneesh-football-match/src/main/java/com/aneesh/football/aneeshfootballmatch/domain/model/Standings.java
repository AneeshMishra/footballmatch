package com.aneesh.football.aneeshfootballmatch.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Standings {
	
			@JsonProperty("country_name")
	    	private String countryName;
			
			@JsonProperty("league_id")
			private String leagueId;
			
			@JsonProperty("league_name")
			private String leagueName;
			
			@JsonProperty("team_id")
			private String teamId;
			
			@JsonProperty("team_name")
			private String teamName;
			
			@JsonProperty("overall_league_position")
			private int overallLeaguePosition;
			
			@JsonProperty("overall_league_payed")
			private int overallLeaguePayed;
			
			@JsonProperty("overall_league_W")
			private int overallLeagueW;
			
			@JsonProperty("overall_league_D")
			private int overallLeagueD;
			
			@JsonProperty("overall_league_L")
			private int overallLeagueL;
			
			@JsonProperty("overall_league_GF")
			private int overallLeagueGF;
			
			@JsonProperty("overall_league_GA")
			private int overallLeagueGA;
			
			@JsonProperty("overall_league_PTS")
			private int overallLeaguePTS;
			
			@JsonProperty("home_league_position")
			private int homeLeaguePosition;
			
			@JsonProperty("home_league_payed")
			private int homeLeaguePayed;
			
			@JsonProperty("home_league_W")
			private int homeLeagueW;
			
			@JsonProperty("home_league_D")
			private int homeLeagueD;
			
			@JsonProperty("home_league_L")
			private int homeLeagueL;
			
			@JsonProperty("home_league_GF")
			private int homeLeagueGF;
			
			@JsonProperty("home_league_GA")
			private int homeLeagueGA;
			
			@JsonProperty("home_league_PTS")
			private int homeLeaguePTS;
			
			@JsonProperty("away_league_position")
			private int awayLeaguePosition;
			
			@JsonProperty("away_league_payed")
			private int awayLeaguePayed;
			
			@JsonProperty("away_league_W")
			private int awayLeagueW;
			
			@JsonProperty("away_league_D")
			private int awayLeagueD;
			
			@JsonProperty("away_league_L")
			private int awayLeagueL;
			
			@JsonProperty("away_league_GF")
			private int awayLeagueGF;
			
			@JsonProperty("away_league_GA")
			private int awayLeagueGA;
			
			@JsonProperty("away_league_PTS")
			private int awayLeaguePTS;
			
			Standings(){
				
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
			public String getTeamId() {
				return teamId;
			}
			public void setTeamId(String teamId) {
				this.teamId = teamId;
			}
			public String getTeamName() {
				return teamName;
			}
			public void setTeamName(String teamName) {
				this.teamName = teamName;
			}
			public int getOverallLeaguePosition() {
				return overallLeaguePosition;
			}
			public void setOverallLeaguePosition(int overallLeaguePosition) {
				this.overallLeaguePosition = overallLeaguePosition;
			}
			public int getOverallLeaguePayed() {
				return overallLeaguePayed;
			}
			public void setOverallLeaguePayed(int overallLeaguePayed) {
				this.overallLeaguePayed = overallLeaguePayed;
			}
			public int getOverallLeagueW() {
				return overallLeagueW;
			}
			public void setOverallLeagueW(int overallLeagueW) {
				this.overallLeagueW = overallLeagueW;
			}
			public int getOverallLeagueD() {
				return overallLeagueD;
			}
			public void setOverallLeagueD(int overallLeagueD) {
				this.overallLeagueD = overallLeagueD;
			}
			public int getOverallLeagueL() {
				return overallLeagueL;
			}
			public void setOverallLeagueL(int overallLeagueL) {
				this.overallLeagueL = overallLeagueL;
			}
			public int getOverallLeagueGF() {
				return overallLeagueGF;
			}
			public void setOverallLeagueGF(int overallLeagueGF) {
				this.overallLeagueGF = overallLeagueGF;
			}
			public int getOverallLeagueGA() {
				return overallLeagueGA;
			}
			public void setOverallLeagueGA(int overallLeagueGA) {
				this.overallLeagueGA = overallLeagueGA;
			}
			public int getOverallLeaguePTS() {
				return overallLeaguePTS;
			}
			public void setOverallLeaguePTS(int overallLeaguePTS) {
				this.overallLeaguePTS = overallLeaguePTS;
			}
			public int getHomeLeaguePosition() {
				return homeLeaguePosition;
			}
			public void setHomeLeaguePosition(int homeLeaguePosition) {
				this.homeLeaguePosition = homeLeaguePosition;
			}
			public int getHomeLeaguePayed() {
				return homeLeaguePayed;
			}
			public void setHomeLeaguePayed(int homeLeaguePayed) {
				this.homeLeaguePayed = homeLeaguePayed;
			}
			public int getHomeLeagueW() {
				return homeLeagueW;
			}
			public void setHomeLeagueW(int homeLeagueW) {
				this.homeLeagueW = homeLeagueW;
			}
			public int getHomeLeagueD() {
				return homeLeagueD;
			}
			public void setHomeLeagueD(int homeLeagueD) {
				this.homeLeagueD = homeLeagueD;
			}
			public int getHomeLeagueL() {
				return homeLeagueL;
			}
			public void setHomeLeagueL(int homeLeagueL) {
				this.homeLeagueL = homeLeagueL;
			}
			public int getHomeLeagueGF() {
				return homeLeagueGF;
			}
			public void setHomeLeagueGF(int homeLeagueGF) {
				this.homeLeagueGF = homeLeagueGF;
			}
			public int getHomeLeagueGA() {
				return homeLeagueGA;
			}
			public void setHomeLeagueGA(int homeLeagueGA) {
				this.homeLeagueGA = homeLeagueGA;
			}
			public int getHomeLeaguePTS() {
				return homeLeaguePTS;
			}
			public void setHomeLeaguePTS(int homeLeaguePTS) {
				this.homeLeaguePTS = homeLeaguePTS;
			}
			public int getAwayLeaguePosition() {
				return awayLeaguePosition;
			}
			public void setAwayLeaguePosition(int awayLeaguePosition) {
				this.awayLeaguePosition = awayLeaguePosition;
			}
			public int getAwayLeaguePayed() {
				return awayLeaguePayed;
			}
			public void setAwayLeaguePayed(int awayLeaguePayed) {
				this.awayLeaguePayed = awayLeaguePayed;
			}
			public int getAwayLeagueW() {
				return awayLeagueW;
			}
			public void setAwayLeagueW(int awayLeagueW) {
				this.awayLeagueW = awayLeagueW;
			}
			public int getAwayLeagueD() {
				return awayLeagueD;
			}
			public void setAwayLeagueD(int awayLeagueD) {
				this.awayLeagueD = awayLeagueD;
			}
			public int getAwayLeagueL() {
				return awayLeagueL;
			}
			public void setAwayLeagueL(int awayLeagueL) {
				this.awayLeagueL = awayLeagueL;
			}
			public int getAwayLeagueGF() {
				return awayLeagueGF;
			}
			public void setAwayLeagueGF(int awayLeagueGF) {
				this.awayLeagueGF = awayLeagueGF;
			}
			public int getAwayLeagueGA() {
				return awayLeagueGA;
			}
			public void setAwayLeagueGA(int awayLeagueGA) {
				this.awayLeagueGA = awayLeagueGA;
			}
			public int getAwayLeaguePTS() {
				return awayLeaguePTS;
			}
			public void setAwayLeaguePTS(int awayLeaguePTS) {
				this.awayLeaguePTS = awayLeaguePTS;
			}
			@Override
			public String toString() {
				return "Standings [countryName=" + countryName + ", leagueId=" + leagueId + ", leagueName=" + leagueName
						+ ", teamId=" + teamId + ", teamName=" + teamName + ", overallLeaguePosition="
						+ overallLeaguePosition + ", overallLeaguePayed=" + overallLeaguePayed + ", overallLeagueW="
						+ overallLeagueW + ", overallLeagueD=" + overallLeagueD + ", overallLeagueL=" + overallLeagueL
						+ ", overallLeagueGF=" + overallLeagueGF + ", overallLeagueGA=" + overallLeagueGA
						+ ", overallLeaguePTS=" + overallLeaguePTS + ", homeLeaguePosition=" + homeLeaguePosition
						+ ", homeLeaguePayed=" + homeLeaguePayed + ", homeLeagueW=" + homeLeagueW + ", homeLeagueD="
						+ homeLeagueD + ", homeLeagueL=" + homeLeagueL + ", homeLeagueGF=" + homeLeagueGF
						+ ", homeLeagueGA=" + homeLeagueGA + ", homeLeaguePTS=" + homeLeaguePTS
						+ ", awayLeaguePosition=" + awayLeaguePosition + ", awayLeaguePayed=" + awayLeaguePayed
						+ ", awayLeagueW=" + awayLeagueW + ", awayLeagueD=" + awayLeagueD + ", awayLeagueL="
						+ awayLeagueL + ", awayLeagueGF=" + awayLeagueGF + ", awayLeagueGA=" + awayLeagueGA
						+ ", awayLeaguePTS=" + awayLeaguePTS + "]";
			}
			
			
			
			
}
