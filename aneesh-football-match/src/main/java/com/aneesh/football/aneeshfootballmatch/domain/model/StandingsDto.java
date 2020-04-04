package com.aneesh.football.aneeshfootballmatch.domain.model;

import java.util.ArrayList;
import java.util.List;

public class StandingsDto {
	
	private List<Standings> standings;
	StandingsDto(){
		this.standings= new ArrayList<>();
	}
	public List<Standings> getStandings() {
		return standings;
	}
	public void setStandings(List<Standings> standings) {
		this.standings = standings;
	}

}
