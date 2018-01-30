package com.moviefinder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.moviefinder.domain.Genre;

public interface GenreRepositry extends JpaRepository<Genre, Integer> {
	
	@Query(value="SELECT * FROM genre",nativeQuery=true)
	List<Genre> findAllGenre();
}
