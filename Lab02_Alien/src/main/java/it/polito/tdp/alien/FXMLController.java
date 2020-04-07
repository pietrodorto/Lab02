package it.polito.tdp.alien;

import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

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
    	
    	txtWord.clear();
    	String word = txtWord.getText();
    	
    	StringTokenizer st = new StringTokenizer(word," ");
    	
    	if (word == null || word.length() == 0) {
    		txtDictionary.setText("Inserici una o più parole");
    		return;
    	}
    	
    	String alien = st.nextToken();
    	if(!alien.matches("[[A-Za-z]]*"))
    	
    	if(st.hasMoreTokens()) {
    		
    		String trans = st.nextToken();
    		
    		
    		
    		
    	}
    	
    
    	

    }

}
