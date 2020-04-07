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
    	
    	
    	String word = txtWord.getText();
    	
    	if(word != null || word.length()!= 0)
    	StringTokenizer st = new StringTokenizer(word," ");
    	
    	String alien = st.nextToken();
    	
    	if()
    	

    }

}
