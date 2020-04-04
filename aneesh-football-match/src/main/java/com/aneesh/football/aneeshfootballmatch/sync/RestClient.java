package com.aneesh.football.aneeshfootballmatch.sync;

import java.util.List;

import com.aneesh.football.aneeshfootballmatch.domain.model.Country;

import com.aneesh.football.aneeshfootballmatch.domain.model.Leagues;
import com.aneesh.football.aneeshfootballmatch.domain.model.Standings;

public interface RestClient {

List<Country> getAllCountries();
	List<Leagues> getLeagues(String countryId);
	List<Standings> findStandings(String leagueId);
}
