package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button btnTranslate;
    
    @FXML
    private Button btnReset;

    @FXML
    void doTranslate(ActionEvent event) {
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    }
    
    
    @FXML
    void initialize() {

    }
}