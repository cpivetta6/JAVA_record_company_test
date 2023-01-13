package com.caiopivetta6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Song;


public interface SongRepository extends JpaRepository<Song, Integer> {

	
	
}
