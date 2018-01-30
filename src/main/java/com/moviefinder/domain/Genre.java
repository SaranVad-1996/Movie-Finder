package com.moviefinder.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * Author: Saran Vadlamudi
 * 
 * Description: Model class for Genre. Mapped by Hibernate to counterpart in MySQL.
 */
@Entity
@Table(name="genre")
public class Genre {
	
	private Integer genreid;
	
	private String genrename;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getGenreid() {
		return genreid;
	}

	public void setGenreid(Integer genreid) {
		this.genreid = genreid;
	}
	
	@Column(name="genrename")
	public String getGenrename() {
		return genrename;
	}

	public void setGenrename(String genrename) {
		this.genrename = genrename;
	}
}
