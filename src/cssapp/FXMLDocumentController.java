/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cssapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author alex
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label message;
    
    @FXML
    private TextArea sampleField;
    @FXML
    private TextField numberField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    boolean isUserLoggedIn = false;
    
    @FXML
    private void clickSignIn(ActionEvent event) {
        if(usernameField.getText().isEmpty()==false
           &&
           passwordField.getText().isEmpty()==false) {
            message.setText("Velkommen, "+usernameField.getText());
            isUserLoggedIn = true;
        }
        else {
            message.setText("Et eller flere felter er tomme");
        }
    }

    @FXML
    private void clickMakeSample(ActionEvent event) {
        if(isUserLoggedIn==true) {
            int sampleSize = Integer.parseInt(numberField.getText());
            for(int i = 1; i<=sampleSize; i++) {
                double number = Math.random();
                sampleField.appendText("Tal nummer "+i+":   "+ number + "\n");
            }
        } else {
            message.setText("Venligst log ind først");
        }
    }


    
    
}
