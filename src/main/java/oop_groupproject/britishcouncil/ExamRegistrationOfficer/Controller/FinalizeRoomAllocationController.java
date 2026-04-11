package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Controller;

import oop_groupproject.britishcouncil.ExamRegistrationOfficer.Model.ExamRegistrationOfficer;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FinalizeRoomAllocationController {
    @FXML private TextField examIDTextField, roomIDTextField, invigilatorIDTextField;


    @FXML
    void FinalizeRoomAllocationButton() {
        ExamRegistrationOfficer.finalizeAllocation(
                examIDTextField.getText(),
                roomIDTextField.getText(),
                invigilatorIDTextField.getText()
        );
    }
}