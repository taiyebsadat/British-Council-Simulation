package oop_groupproject.britishcouncil.IeltsCandidate.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class startMockTestController {
    @FXML private TextField mockTestIDTextField;

    @FXML
    public void startTestButton(ActionEvent actionEvent) {
        System.out.println("Starting Test for ID: " + mockTestIDTextField.getText());
    }
}