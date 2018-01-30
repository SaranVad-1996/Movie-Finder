package com.moviefinder.repository;
/*
 * Author: Saran Vadlamudi
 * 
 * Description: Repository that uses native queries to allow for greater flexibility when submitting different combinations of parameters
 */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.moviefinder.domain.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	@Query(value="SELECT * "
			    +"FROM movie INNER JOIN movie_genre "
			    +	"ON movie.movieid = movie_genre.movieid INNER JOIN genre "
			    +	"ON movie_genre.genreid = genre.genreid "
			    +"WHERE genre.genrename= ?",nativeQuery=true)
	List<Movie> findAllByGenre(String genre);
	
	@Query(value="SELECT * "
				+"FROM movie "
				+"WHERE movie.country=?",nativeQuery=true)
	List<Movie> findAllByCountry(String country);
	
	@Query(value="SELECT * "
				+"FROM movie "
				+"WHERE movie.language=?",nativeQuery=true)
	List<Movie> findAllByLanguage(String language);
	
	@Query(value="SELECT * "
				+"FROM movie "
				+"WHERE movie.year=?1",nativeQuery=true)
	List<Movie> findAllByYear(Integer year);
	
	@Query(value="SELECT * "
		    +"FROM movie INNER JOIN movie_genre "
		    +	"ON movie.movieid = movie_genre.movieid INNER JOIN genre "
		    +	"ON movie_genre.genreid = genre.genreid "
		    +"WHERE genre.genrename=? AND movie.country=?",nativeQuery=true)
	List<Movie> findByGenreCountry(String genre,String country);
	
	@Query(value="SELECT * "
		    +"FROM movie INNER JOIN movie_genre "
		    +	"ON movie.movieid = movie_genre.movieid INNER JOIN genre "
		    +	"ON movie_genre.genreid = genre.genreid "
		    +"WHERE genre.genrename=? AND movie.country=? AND movie.language=?",nativeQuery=true)
	List<Movie> findByGenreCountryLang(String genre,String country,String language);
	
	@Query(value="SELECT * "
		    +"FROM movie INNER JOIN movie_genre "
		    +	"ON movie.movieid = movie_genre.movieid INNER JOIN genre "
		    +	"ON movie_genre.genreid = genre.genreid "
		    +"WHERE genre.genrename=? AND movie.country=? AND movie.language=? AND movie.year=?1",nativeQuery=true)
	List<Movie> findByGenreCountryLangYear(String genre,String country,String language,Integer year);
	
	@Query(value="SELECT * "
		    +"FROM movie INNER JOIN movie_genre "
		    +	"ON movie.movieid = movie_genre.movieid INNER JOIN genre "
		    +	"ON movie_genre.genreid = genre.genreid "
		    +"WHERE genre.genrename=? AND movie.language=?",nativeQuery=true)
	List<Movie> findAllByGenreLang(String genre,String language);
	
	@Query(value="SELECT * "
		    +"FROM movie INNER JOIN movie_genre "
		    +	"ON movie.movieid = movie_genre.movieid INNER JOIN genre "
		    +	"ON movie_genre.genreid = genre.genreid "
		    +"WHERE genre.genrename=? AND movie.language=? AND year=?1",nativeQuery=true)
	List<Movie> findAllByGenreLangYear(String genre,String language,Integer year);
	
	@Query(value="SELECT * "
		    +"FROM movie INNER JOIN movie_genre "
		    +	"ON movie.movieid = movie_genre.movieid INNER JOIN genre "
		    +	"ON movie_genre.genreid = genre.genreid "
		    +"WHERE genre.genrename=? AND movie.country=? AND movie.year=?1",nativeQuery=true)
	List<Movie> findByGenreCountryYear(String genre,String country,Integer year);
	
	@Query(value="SELECT * "
		    +"FROM movie INNER JOIN movie_genre "
		    +	"ON movie.movieid = movie_genre.movieid INNER JOIN genre "
		    +	"ON movie_genre.genreid = genre.genreid "
		    +"WHERE genre.genrename=? AND movie.year=?1",nativeQuery=true)
	List<Movie> findAllByGenreYear(String genre,Integer year);
	
	@Query(value="SELECT * "
				+"FROM movie "
				+"WHERE movie.country=? AND movie.language=?",nativeQuery=true)
	List<Movie> findAllByCountryLang(String country,String language);
	
	@Query(value="SELECT * "
				+"FROM movie "
				+"WHERE movie.country=? AND movie.language=? AND movie.year=?1",nativeQuery=true)
	List<Movie> findAllByCountryLangYear(String country,String language,Integer year);
	
	@Query(value="SELECT * "
				+"FROM movie "
				+"WHERE movie.country=? AND movie.year=?1",nativeQuery=true)
	List<Movie> findAllByCountryYear(String country,Integer year);
	
	@Query(value="SELECT * "
				+"FROM movie "
				+"WHERE movie.language=? AND movie.year=?1",nativeQuery=true)
	List<Movie> findAllByLangYear(String language,Integer year);
}
