package com.psl.training.oop.collectionTester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.psl.training.oop.collection.Movie;
import com.psl.training.oop.collectionService.MovieService;

public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> movielist = new ArrayList<>();
		
		MovieService service = new MovieService();
		
		movielist = service.CreateMovielist();
		
		System.out.println("Size : " + movielist.size());
		
		for(Movie m : movielist)
		{
			System.out.println(m.getName());
		}

		movielist.sort(new LanguageSort());
		System.out.println("--------Sort By Language---------");
		for(Movie m : movielist)
		{
			System.out.println(m.getName()+" " +m.getLanguage());
		}
		
		Comparator<Movie> sortByDuration = new Comparator<Movie>(){

			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				if(o1.getDuration()==o2.getDuration())
					return 0;
				else if(o1.getDuration()>o2.getDuration())
					return 1;
				else
					return -1;
			}
			
		};
		
		movielist.sort(sortByDuration);
		System.out.println("--------Sort By Duration---------");
		for(Movie m : movielist)
		{
			System.out.println(m.getName()+" " +m.getDuration());
		}
		
		movielist.sort(new LanguageAndRelease());
		System.out.println("--------Sort By Language and Release Date ---------");
		for(Movie m : movielist)
		{
			System.out.println(m.getName()+" " +m.getLanguage()+" "+m.getReleaseDate());
		}
	}

}
