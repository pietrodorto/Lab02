package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	List<Word> dictionary = new ArrayList<>();

	public AlienDictionary() {
		super();
	}

	public void addWord(String alien, String trans) {

		Word w = new Word(alien, trans);
		if (dictionary.contains(w)) {
			dictionary.get(dictionary.indexOf(w)).setTranslation(trans);
		}
		dictionary.add(w);
	}

	public String translateWord(String alienWord) {

		Word datradurre = new Word(alienWord);
		if (dictionary.contains(datradurre)) {
			return dictionary.get(dictionary.indexOf(datradurre)).getTranslation();
		}
		return null;

	}

}
