/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package helloworldjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Camila
 */

// implements == interface
public class FXMLDocumentController implements Initializable {
    
    // adição de controles
    @FXML
    private Label lblMensagem;
    private Button btnClick;
    
    // código do evento
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Hello World!!!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
