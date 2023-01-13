package com.caiopivetta6.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiopivetta6.Services.ArtistService;
import com.caiopivetta6.domain.Artist;

@RestController
@RequestMapping(value = "/artist")
public class ArtistResource {
	
	@Autowired
	private ArtistService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Artist> findById (@PathVariable Integer id) {
		
		Artist obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}