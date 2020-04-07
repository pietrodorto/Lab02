package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionaty {
	
	List<Word> dictionary = new ArrayList<>();
	
	public AlienDictionaty(){
		super();
	}
	
	public void addWord(String alienWord, String translation) {
		
		Word w = new Word(alienWord, translation);
		if(dictionary.contains(w)) {
			
			}
	}
}
