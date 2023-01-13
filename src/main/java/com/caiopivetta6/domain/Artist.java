package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

public class Artist implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String nationality;
	
	
	public Artist() {
		
	}


	public Artist(Integer id, String name, String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
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


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
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
		Artist other = (Artist) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
