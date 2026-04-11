package oop_groupproject.britishcouncil.IeltsCandidate.Controller;

import oop_groupproject.britishcouncil.IeltsCandidate.Model.IeltsCandidate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class submitHomeworkController {
    @FXML private TextField submitTaskIDTextField;

    @FXML
    public void submitButton(ActionEvent actionEvent) {
        IeltsCandidate.submitHomework(submitTaskIDTextField.getText(), "Submitted Successfully");
    }

    @FXML
    public void updateFileButton(ActionEvent actionEvent) {
        System.out.println("Opening File Chooser...");
    }
}