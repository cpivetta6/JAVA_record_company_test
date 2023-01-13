package com.caiopivetta6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Artist;


public interface ArtistRepository extends JpaRepository<Artist, Integer> {

	
	
}
