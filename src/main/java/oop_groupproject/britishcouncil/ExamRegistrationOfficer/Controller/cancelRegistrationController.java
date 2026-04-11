package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Controller;

import oop_groupproject.britishcouncil.ExamRegistrationOfficer.Model.ExamRegistrationOfficer;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class cancelRegistrationController {
    @FXML private TextField cancelRegIDTextField;
    @FXML
    void CancelRegistrationButton() {
        ExamRegistrationOfficer.cancelRegistration(cancelRegIDTextField.getText());
    }
}