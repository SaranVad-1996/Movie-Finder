INSERT INTO movie(movieid,title,description,language,year,country,imagepath) VALUES (NULL,'Doctor Strange','An egotisical neurosurgeon (Benedict Cumberbatch) goes on a path of redemption after a car accident that makes his hands worhtless','English',2016,'USA','/Images/Doctor_Strange_poster.jpg');  	
INSERT INTO movie(movieid,title,description,language,year,country,imagepath) VALUES (NULL,'Die Hard','New York City Police Department officer John McClane (Bruce Willis) who is caught in a Los Angeles skyscraper during a Christmas Eve heist led by Hans Gruber (Alan Rickman)','English',1988,'USA','/Images/p10255_p_v8_ar.jpg');  	
INSERT INTO movie(movieid,title,description,language,year,country,imagepath) VALUES (NULL,'Groundhog Day','Phil Connors, an arrogant Pittsburgh TV weatherman who, during an assignment covering the annual Groundhog Day event in Punxsutawney, Pennsylvania, finds himself caught in a time loop, repeating the same day again and again','English',1993,'USA','/Images/Groundhog_Day_(movie_poster).jpg');

INSERT INTO genre(genreid,genrename) VALUES (NULL,'Action');
INSERT INTO genre(genreid,genrename) VALUES (NULL,'Science Fiction');
INSERT INTO genre(genreid,genrename) VALUES (NULL,'Comedy');

INSERT INTO movie_genre(movieid,genreid) VALUES (1,1);
INSERT INTO movie_genre(movieid,genreid) VALUES (1,2);
INSERT INTO movie_genre(movieid,genreid) VALUES (2,1);
INSERT INTO movie_genre(movieid,genreid) VALUES (3,3);

