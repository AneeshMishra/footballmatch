package com.aneesh.football.aneeshfootballmatch.service;

import com.aneesh.football.aneeshfootballmatch.domain.model.FootBallMatchDto;

public interface FootballMatchStandingsService {
	
	FootBallMatchDto findFootBallMatchStandings(String countryName, String leagueName, String teamName);

}
