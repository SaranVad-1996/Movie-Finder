SET foreign_key_checks = 0;
DROP TABLE IF EXISTS movie;
DROP TABLE IF EXISTS genre;
DROP TABLE IF EXISTS movie_genre;
CREATE TABLE movie(
						movieid INTEGER NOT NULL AUTO_INCREMENT,
						title varchar(20),
						description varchar(300),
                        language varchar(10),
                        year INTEGER,
                        country varchar(15),
						imagepath varchar(110),
						PRIMARY KEY (movieid)
				  );

CREATE TABLE genre(
						genreid INTEGER NOT NULL AUTO_INCREMENT,
                        genrename varchar(15),
						PRIMARY KEY (genreid)
				  );
                    
CREATE TABLE movie_genre(
							movieid INTEGER,
                            genreid INTEGER,
                            FOREIGN KEY (movieid) REFERENCES movie(movieid),
                            FOREIGN KEY (genreid) REFERENCES genre(genreid)
						);