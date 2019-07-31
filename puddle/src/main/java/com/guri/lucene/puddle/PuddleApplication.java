package com.guri.lucene.puddle;

import java.io.IOException;

import org.apache.lucene.queryparser.classic.ParseException;

public class PuddleApplication {

	public static void main(String[] args) {
		// This is to start testing the application
		LuceneInitializer tester = new LuceneInitializer();

		createIndexAndSearch(tester);
		specificSearch(tester);
	}

	public static void createIndexAndSearch(LuceneInitializer tester) {
		try {
			tester.createIndex();
			tester.search("Master");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void specificSearch(LuceneInitializer tester) {
		try {
			tester.search("pig");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
