package com.caiopivetta6;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.Album;
import com.caiopivetta6.domain.Artist;
import com.caiopivetta6.domain.Song;
import com.caiopivetta6.repositories.AlbumRepository;
import com.caiopivetta6.repositories.ArtistRepository;
import com.caiopivetta6.repositories.SongRepository;

@SpringBootApplication
public class RecordCompanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RecordCompanyApplication.class, args);
	}
	
	@Autowired
	private ArtistRepository artistRepository;
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private SongRepository songRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//ARTIST AND SONG
		Artist artist = new Artist(null, "Axel Rose", "American");
		
		artistRepository.save(artist);
		
		//ALBUM AND SONG
		Album album = new Album(null,"Guns Live Toronto", 1998);
		
		artist.getAlbum().add(album);
		album.setArtist(artist);
		
		Song song1 = new Song(null, "Dont cry", 3);
		Song song2 = new Song(null, "November rain", 3);
		Song song3 = new Song(null, "Paradise", 3);
		Song song4 = new Song(null, "Concret Jungle", 3);
		Song song5 = new Song(null, "Patient", 3);
		
		song1.setAlbum(album);
		song2.setAlbum(album);
		song3.setAlbum(album);
		song4.setAlbum(album);
		song5.setAlbum(album);
		album.getSong().addAll(Arrays.asList(song1, song2, song3, song4, song5));
		
		song1.setArtist(artist);
		song2.setArtist(artist);
		song3.setArtist(artist);
		song4.setArtist(artist);
		song5.setArtist(artist);
		artist.getSong().addAll(Arrays.asList(song1, song2, song3, song4, song5));
		
		albumRepository.save(album);
		songRepository.saveAll(Arrays.asList(song1, song2, song3, song4, song5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
