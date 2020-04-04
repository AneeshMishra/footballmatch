package com.aneesh.football.aneeshfootballmatch.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aneesh.football.aneeshfootballmatch.domain.model.Country;
import com.aneesh.football.aneeshfootballmatch.domain.model.FootBallMatchDto;
import com.aneesh.football.aneeshfootballmatch.domain.model.Leagues;
import com.aneesh.football.aneeshfootballmatch.domain.model.Standings;
import com.aneesh.football.aneeshfootballmatch.sync.RestClientImpl;

@Service
public class FootballMatchStandingsServiceImpl implements FootballMatchStandingsService {
	
	@Autowired
	RestClientImpl restClient;

	@Override
	public FootBallMatchDto findFootBallMatchStandings(String countryName, String leagueName, String teamName) {
		// TODO Auto-generated method stub
		
		Stream<Country> countryStream = restClient.getAllCountries().stream();
		
		List<Country> filteredCountrylist= countryStream.filter(cs ->
			cs.getCountryName().equals(countryName)
		).collect(Collectors.toList());
		
//		countryStream.filter(cs ->
//		cs.getCountryName().equals(countryName)
//	).map(fcs ->{
//		restClient.getLeagues(fcs.getCountryId()).stream().filter(fln ->leagueName.equals(fln)).
//				map(filteredLeage -> {
//					restClient.findStandings(filteredLeage.getLeagueId());
//				}).collect(Collectors.toList()
//	});
		FootBallMatchDto footBallMatchDto = new FootBallMatchDto();
		
	List<Country> countryList=	restClient.getAllCountries();
		for(Country cl:countryList) {
			if(cl.getCountryName().equals(countryName)) {
			List<Leagues> leagueList=	restClient.getLeagues(cl.getCountryId());
			for(Leagues le:leagueList) {
				if(le.getLeagueName().equals(leagueName)) {
					List<Standings>standinglist=restClient.findStandings(le.getLeagueId());
					for(Standings st: standinglist) {
						footBallMatchDto.setAwayLeagueD(st.getAwayLeagueD());
					}
				}
			}
			}
		}
		
		return footBallMatchDto;
	}

}
