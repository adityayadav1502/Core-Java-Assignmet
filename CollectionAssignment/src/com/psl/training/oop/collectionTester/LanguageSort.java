package com.psl.training.oop.collectionTester;
import java.util.Comparator;

import com.psl.training.oop.collection.Movie;

public class LanguageSort implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		// TODO Auto-generated method stub
		return m1.getLanguage().compareTo(m2.getLanguage());
	}

}
