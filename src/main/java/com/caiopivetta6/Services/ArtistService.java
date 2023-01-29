package com.caiopivetta6.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.caiopivetta6.Services.exceptions.DatabaseException;
import com.caiopivetta6.Services.exceptions.ObjectNotFoundException;
import com.caiopivetta6.Services.exceptions.ResourceNotFoundException;
import com.caiopivetta6.domain.Artist;
import com.caiopivetta6.repositories.ArtistRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ArtistService {
	
	@Autowired
	private ArtistRepository repository;
	
	public Artist find(Integer id) {
		
		Optional<Artist> obj = repository.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + Artist.class.getName()));

	}
	
	public Artist insert(Artist obj) {
		repository.save(obj);
		return obj;
	}
	
	
	public void delete(Integer id) {
		try {
		repository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Artist update(Integer id, Artist obj) {
		try {
		Artist entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		}catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		
	}
	
	private void updateData(Artist entity, Artist obj) {
		entity.setName(obj.getName());
		entity.setNationality(obj.getNationality());
		//entity.setPhone(obj.getPhone());
	}
	
}
