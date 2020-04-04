package com.aneesh.football.aneeshfootballmatch.sync;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.aneesh.football.aneeshfootballmatch.domain.model.Country;
import com.aneesh.football.aneeshfootballmatch.domain.model.CountryDto;
import com.aneesh.football.aneeshfootballmatch.domain.model.Leagues;
import com.aneesh.football.aneeshfootballmatch.domain.model.LeaguesDto;
import com.aneesh.football.aneeshfootballmatch.domain.model.Standings;
import com.aneesh.football.aneeshfootballmatch.domain.model.StandingsDto;


@Service
public class RestClientImpl implements RestClient {
	
	private static final String API_FOOTBALL_BASE_URL="https://apiv2.apifootball.com";
	private static final String APIKEY= "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Country> getAllCountries() {
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(API_FOOTBALL_BASE_URL)
				.queryParam("action", "get_countries")
				.queryParam("APIkey", APIKEY);
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<?> entity = new HttpEntity<>(headers);
		
		ResponseEntity<CountryDto> result = restTemplate
				.exchange(builder.build().encode().toUri(), HttpMethod.GET, entity,CountryDto.class);
		
		return result.getBody().getCountry();
	}

	@Override
	public List<Leagues> getLeagues(String countryId) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(API_FOOTBALL_BASE_URL)
				.queryParam("action", "get_leagues")
				.queryParam("country_id", countryId)
				.queryParam("APIkey", APIKEY);
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<?> entity = new HttpEntity<>(headers);
		
		ResponseEntity<LeaguesDto> result = restTemplate
				.exchange(builder.build().encode().toUri(), HttpMethod.GET, entity,LeaguesDto.class);
		
		return result.getBody().getLeague();
	}

	@Override
	public List<Standings> findStandings(String leagueId) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(API_FOOTBALL_BASE_URL)
				.queryParam("action", "get_countries")
				.queryParam("country_id", leagueId)
				.queryParam("APIkey", APIKEY);
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<?> entity = new HttpEntity<>(headers);
		
		ResponseEntity<StandingsDto> result = restTemplate
				.exchange(builder.build().encode().toUri(), HttpMethod.GET, entity,StandingsDto.class);
		
		return result.getBody().getStandings();
	}

}
