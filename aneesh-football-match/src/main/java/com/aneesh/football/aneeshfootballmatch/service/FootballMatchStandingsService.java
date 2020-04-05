package com.aneesh.football.aneeshfootballmatch.service;

import java.util.List;

import com.aneesh.football.aneeshfootballmatch.domain.model.FootBallMatchDto;


public interface FootballMatchStandingsService {
	
	List<FootBallMatchDto> findFootBallMatchStandings(String countryName, String leagueName, String teamName);

}
