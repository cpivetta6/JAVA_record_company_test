package com.caiopivetta6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Album;


public interface AlbumRepository extends JpaRepository<Album, Integer> {

	
	
}
