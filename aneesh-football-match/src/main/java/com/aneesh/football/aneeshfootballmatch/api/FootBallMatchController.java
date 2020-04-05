package com.aneesh.football.aneeshfootballmatch.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aneesh.football.aneeshfootballmatch.domain.model.FootBallMatchDto;
import com.aneesh.football.aneeshfootballmatch.service.FootballMatchStandingsService;

@RestController
@RequestMapping(value = "footballmatch")
public class FootBallMatchController {

	@Autowired
	FootballMatchStandingsService footballMatchStandingsService;

	@GetMapping(value = "/findStandings")
	public ResponseEntity<List<FootBallMatchDto>> findStandings(@RequestParam(required = true) String countryName,
			@RequestParam(required = true) String leagueName, @RequestParam(required = true) String teamName) {

		List<FootBallMatchDto> history = footballMatchStandingsService.findFootBallMatchStandings(countryName, leagueName,
				teamName);

		return ResponseEntity.ok(history);
	}
}
