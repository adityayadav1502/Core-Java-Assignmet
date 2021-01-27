package com.psl.training.oop.collectionService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.psl.training.oop.collection.Movie;

public class MovieService {

	List<Movie> movielist = new ArrayList<>();
	
	public List<Movie> CreateMovielist()  
	{
		movielist.add(new Movie("Surya","Marathi",Date.valueOf("1999-02-15"),"Kiran","Ashwini",3));
		movielist.add(new Movie("Maa","Hindi",Date.valueOf("1999-03-15"),"Rakesh","Asha",4));
		movielist.add(new Movie("Murder","Marathi",Date.valueOf("1999-04-15"),"Rajesh","Neel",2));
		movielist.add(new Movie("Raj","English",Date.valueOf("1999-05-15"),"Kumar","Nupur",3));
		movielist.add(new Movie("Veer","Punjabi",Date.valueOf("1999-06-15"),"Sanket","Prashant",5));
	
		return movielist;
	}
}
