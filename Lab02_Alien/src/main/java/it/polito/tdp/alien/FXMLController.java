package it.polito.tdp.alien;

import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private AlienDictionary dictionary = new AlienDictionary();

    @FXML
    private TextField txtWord;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtDictionary;

    @FXML
    private Button btnClear;

    @FXML
    void doReset(ActionEvent event) {
    	txtWord.clear();
    	txtDictionary.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	
    	String word = txtWord.getText().toLowerCase();
    	
    	StringTokenizer st = new StringTokenizer(word," ");
    	
    	if (word == null || word.length() == 0) {
    		txtDictionary.setText("Inserici una o più parole");
    		return;
    	}
    	
    	String alien = st.nextToken();
    	
    	
    	if(st.hasMoreTokens()) {
    		
    		String trans = st.nextToken().toLowerCase();
    		
    		if(!alien.matches("[a-zA-Z]*") || !trans.matches("[a-zA-Z]*")) {
    			txtDictionary.setText("Inserici una o più parole");
        		return;
    		}
    		
    		dictionary.addWord(alien, trans);
    		txtDictionary.setText("hai aggiunto la parola :"+alien+" / "+trans);
    				
    	}
    	
    	String trad = dictionary.translateWord(alien);
    	txtDictionary.setText(trad.toString());
    	
    
    	

    }

}
