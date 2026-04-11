package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class generateRegistrationSlipController {
    @FXML private TextField slipRegIDTextField;

    @FXML
    void GenerateRegistrationSlipButton() {
        System.out.println("Generating PDF for: " + slipRegIDTextField.getText());
    }
}