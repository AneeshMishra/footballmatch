package com.aneesh.football.aneeshfootballmatch.service;

import java.util.ArrayList;
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
	public List<FootBallMatchDto> findFootBallMatchStandings(String countryName, String leagueName, String teamName) {
	
		List<FootBallMatchDto> listfbm= new ArrayList<>();

		List<Standings>standinglist= null;
	List<Country> countryList=	restClient.getAllCountries();
	
		for(Country cl:countryList) {
			if(cl.getCountryName().equals(countryName)) {
			List<Leagues> leagueList=	restClient.getLeagues(cl.getCountryId());
			
			if(leagueList !=null && !leagueList.isEmpty() ) {
			for(Leagues le:leagueList) {
				if(le.getLeagueName().equals(leagueName)) {
					standinglist=restClient.findStandings(le.getLeagueId());
					for(Standings st: standinglist) {
						if(st.getTeamName().equals(teamName)) {
						FootBallMatchDto fbmd = new FootBallMatchDto();
						fbmd.setCountryName(st.getCountryName());
						fbmd.setCountryId(cl.getCountryId());
						fbmd.setLeagueName(st.getLeagueName());
						fbmd.setAwayLeagueD(st.getAwayLeagueD());
						fbmd.setTeamName(st.getTeamName());
						listfbm.add(fbmd);
						
						}
					}
				}
			}
			}
			}
		}
		return listfbm;
	}

}
