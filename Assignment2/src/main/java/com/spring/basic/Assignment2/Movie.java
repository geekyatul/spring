package com.spring.basic.Assignment2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Movie {
	@Value("M001")
	private String movieid;
	@Value("The Firm")
	private String movieName;
	@Value("Tom Cruise")
	private String movieActor;
	
	public Movie()
	{
		
	}
	
	public Movie(String movieid, String movieName, String movieActor) {
		super();
		this.movieid = movieid;
		this.movieName = movieName;
		this.movieActor = movieActor;
	}
	public String getMovieId() {
		return movieid;
	}
	public void setMovieId(String movieId) {
		this.movieid= movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	

	@Override
	public String toString() {
		return "Movie [movieId=" + movieid + ", movieName=" + movieName + ", movieActor=" + movieActor + "]";
	}
	
}
