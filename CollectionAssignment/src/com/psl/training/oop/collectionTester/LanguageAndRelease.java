package com.psl.training.oop.collectionTester;

import java.util.Comparator;

import com.psl.training.oop.collection.Movie;

public class LanguageAndRelease implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		int i = o1.getLanguage().compareTo(o2.getLanguage());
		if(i==0)
		{
			i = o1.getReleaseDate().compareTo(o2.getReleaseDate());
		}
		return i;
	}

}
