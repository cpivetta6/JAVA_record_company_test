package com.caiopivetta6.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiopivetta6.Services.exceptions.ObjectNotFoundException;
import com.caiopivetta6.domain.Artist;
import com.caiopivetta6.repositories.ArtistRepository;

@Service
public class ArtistService {
	
	@Autowired
	private ArtistRepository repository;
	
	public Artist find(Integer id) {
		
		Optional<Artist> obj = repository.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + Artist.class.getName()));

	}
}
