package com.aneesh.football.aneeshfootballmatch.domain.model;

import java.util.ArrayList;
import java.util.List;

public class LeaguesDto {
	
	private List<Leagues> league;
	LeaguesDto(){
		this.league= new ArrayList<>();
	}

	public List<Leagues> getLeague() {
		return league;
	}

	public void setLeague(List<Leagues> league) {
		this.league = league;
	}
	

}
