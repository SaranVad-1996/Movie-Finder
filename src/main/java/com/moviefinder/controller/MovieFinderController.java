package com.moviefinder.controller;
import org.springframework.beans.factory.annotation.Autowired;
/*
 * Author: Saran Vadlamudi
 * Description: Controller handles the request and response.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moviefinder.repository.MovieRepository;
import com.moviefinder.service.MovieService;

@Controller
public class MovieFinderController {
	
	@Autowired
	private MovieService ms;
	/**
	 * This method returns the home page with the form to search for movies
	 * 
	 * @param model
	 * @return "home"
	 */
	@RequestMapping("/home")
	public String homepage(Model model) {
		return "home";
	}
	
	/**
	 * After submitting the form on the home page,
	 * this method returns with the result page with movies that satisfies the parameters
	 * 
	 * @param genre
	 * @param country
	 * @param lang
	 * @param year
	 * @param model
	 * @return "result"
	 */
	@RequestMapping(value="/result", method=RequestMethod.GET)
	public String resultpage(String genre,String country, String lang, Integer year, Model model) {
		if(!genre.equals("") && country.equals("") && lang.equals("") && year == null) {
			model.addAttribute("movies", ms.findAllByGenre(genre));
		}else
			if(!genre.equals("") && !country.equals("") && lang.equals("") && year == null) {
				model.addAttribute("movies", ms.findByGenreCountry(genre, country));
			}else
				if(!genre.equals("") && !country.equals("") && !lang.equals("") && year == null) {
					model.addAttribute("movies",ms.findByGenreCountryLang(genre, country, lang));
				}else
					if(!genre.equals("") && !country.equals("") && !lang.equals("") && year != null) {
						model.addAttribute("movies",ms.findByGenreCountryLangYear(genre, country, lang, year));
					}else
						if(!genre.equals("") && country.equals("") && !lang.equals("") && year == null) {
							model.addAttribute("movies", ms.findAllByGenreLang(genre, lang));
						}else
							if(!genre.equals("") && country.equals("") && !lang.equals("") && year != null) {
								model.addAttribute("movies", ms.findAllByGenreLangYear(genre, lang, year));
							}else
								if(!genre.equals("") && !country.equals("") && lang.equals("") && year != null) {
									model.addAttribute("movies", ms.findByGenreCountryYear(genre, country, year));
								}else
									if(!genre.equals("") && country.equals("") && lang.equals("") && year != null) {
										model.addAttribute("movies", ms.findAllByGenreYear(genre, year));
									}else
										if(genre.equals("") && !country.equals("") && !lang.equals("") && year == null) {
											model.addAttribute("movies", ms.findAllByCountryLang(country, lang));
										}else
											if(genre.equals("") && !country.equals("") && !lang.equals("") && year != null) {
												model.addAttribute("movies", ms.findAllByCountryLangYear(country, lang, year));
											}else
												if(genre.equals("") && country.equals("") && !lang.equals("") && year != null) {
													model.addAttribute("movies", ms.findAllByLangYear(lang, year));
												}else
													if(genre.equals("") && !country.equals("") && lang.equals("") && year == null) {
														model.addAttribute("movies", ms.findAllByCountry(country));
													}else
														if(genre.equals("") && country.equals("") && !lang.equals("") && year == null) {
															model.addAttribute("movies", ms.findAllByLanguage(lang));
														}else
															if(genre.equals("") && country.equals("") && lang.equals("") && year != null) {
																model.addAttribute("movies", ms.findAllByYear(year));
															}
		return "result";
	}
}
