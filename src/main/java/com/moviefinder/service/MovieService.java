package com.moviefinder.service;
/*
 * Author: Saran
 * Description: Service class is the layer between the repository and the controller which needs utilizes the DAO's methods 
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviefinder.domain.Movie;
import com.moviefinder.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository mr;
	
	public List<Movie> findAllByGenre(String genre){
		return mr.findAllByGenre(genre);
	}
	
	public List<Movie> findAllByCountry(String country){
		return mr.findAllByCountry(country);
	}
	
	public List<Movie> findAllByLanguage(String language){
		return mr.findAllByLanguage(language);
	}
	
	public List<Movie> findAllByYear(Integer year){
		return mr.findAllByYear(year);
	}
	
	public List<Movie> findByGenreCountry(String genre,String country){
		return mr.findByGenreCountry(genre, country);
	}
	
	public List<Movie> findByGenreCountryLang(String genre,String country,String language){
		return mr.findByGenreCountryLang(genre, country, language);
	}
	
	public List<Movie> findByGenreCountryLangYear(String genre,String country,String language,Integer year){
		return mr.findByGenreCountryLangYear(genre, country, language, year);
	}
	
	public List<Movie> findAllByGenreLang(String genre,String language){
		return mr.findAllByGenreLang(genre, language);
	}
	
	public List<Movie> findAllByGenreLangYear(String genre,String language,Integer year){
		return mr.findAllByGenreLangYear(genre, language, year);
	}
	
	public List<Movie> findByGenreCountryYear(String genre,String country,Integer year){
		return mr.findByGenreCountryYear(genre, country, year);
	}
	
	public List<Movie> findAllByGenreYear(String genre,Integer year){
		return mr.findAllByGenreYear(genre, year);
	}
	
	public List<Movie> findAllByCountryLang(String country,String language){
		return mr.findAllByCountryLang(country, language);
	}
	
	public List<Movie> findAllByCountryLangYear(String country,String language,Integer year){
		return mr.findAllByCountryLangYear(country, language, year);
	}
	
	public List<Movie> findAllByCountryYear(String country,Integer year){
		return mr.findAllByCountryYear(country, year);
	}
	
	public List<Movie> findAllByLangYear(String language,Integer year){
		return mr.findAllByLangYear(language, year);
	}
}
