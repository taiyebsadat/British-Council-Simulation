package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class updateCandidateController {
    @FXML private TextField CandidateIDTextField, passportNoTextField;
    @FXML private TextArea newInfoTextArea;

    @FXML
    void UpdateRecordButton() {

        System.out.println("Updating record for: " + CandidateIDTextField.getText());
    }
}