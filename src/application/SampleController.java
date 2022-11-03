package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    private Label fname; // Value injected by FXMLLoader

    @FXML // fx:id="fname1"
    private TextField fname1; // Value injected by FXMLLoader

    private Label lname; // Value injected by FXMLLoader

    @FXML // fx:id="lname1"
    private TextField lname1; // Value injected by FXMLLoader

    @FXML // fx:id="register"
    private Button register; // Value injected by FXMLLoader

    @FXML // fx:id="roll"
    private Label roll; // Value injected by FXMLLoader

    @FXML // fx:id="roll1"
    private TextField roll1; // Value injected by FXMLLoader

    @FXML // fx:id="warning"
    private Label warning; // Value injected by FXMLLoader

    @FXML
    void RegisterStudent(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert fname != null : "fx:id=\"fname\" was not injected: check your FXML file 'Sample.fxml'.";
        assert fname1 != null : "fx:id=\"fname1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert lname != null : "fx:id=\"lname\" was not injected: check your FXML file 'Sample.fxml'.";
        assert lname1 != null : "fx:id=\"lname1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert register != null : "fx:id=\"register\" was not injected: check your FXML file 'Sample.fxml'.";
        assert roll != null : "fx:id=\"roll\" was not injected: check your FXML file 'Sample.fxml'.";
        assert roll1 != null : "fx:id=\"roll1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert warning != null : "fx:id=\"warning\" was not injected: check your FXML file 'Sample.fxml'.";

    }

}
