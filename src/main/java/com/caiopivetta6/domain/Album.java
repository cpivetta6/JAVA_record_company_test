package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

public class Album implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer albumYear;
	
	public Album() {
		
	}

	public Album(Integer id, String name, Integer albumYear) {
		super();
		this.id = id;
		this.name = name;
		this.albumYear = albumYear;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAlbumYear() {
		return albumYear;
	}

	public void setAlbumYear(Integer albumYear) {
		this.albumYear = albumYear;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
