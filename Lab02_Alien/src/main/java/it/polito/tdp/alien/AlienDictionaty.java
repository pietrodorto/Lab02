package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionaty {
	
	List<Word> dictionary = new ArrayList<>();
	
	public AlienDictionaty(){
		super();
	}
	
	public void addWord(String alien, String trans) {
		
		Word w = new Word(alien, trans);
		if(dictionary.contains(w)) {
			dictionary.get(dictionary.indexOf(w)).setTranslation(trans);
			}
		dictionary.add(w);
	}
	
	public String translateWord(String alienWord) {
		String r = "";
		Word datradurre = new Word(alienWord,null);
		for(Word w : dictionary ) {
			
			if(w.equals(datradurre)) 
				r = w.getTranslation();	 
			else 
				r = null;
		}	
		return r;
	}
	
	
}
