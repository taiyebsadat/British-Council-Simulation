package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Controller;

import com.example.britishcouncil.ExamRegistrationOfficer.Model.ExamRegistrationOfficer;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class assignExamSessionController {
    @FXML private TextField candidateIDTestField;
    @FXML private DatePicker sessionDateDatePicker;


    @FXML
    void AssignSessionButton() {
        ExamRegistrationOfficer.assignSession(candidateIDTestField.getText(), sessionDateDatePicker.getValue());
        System.out.println("Session Assigned!");
    }
}