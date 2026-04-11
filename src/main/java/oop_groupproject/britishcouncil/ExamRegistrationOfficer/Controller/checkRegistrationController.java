package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Controller;

import oop_groupproject.britishcouncil.ExamRegistrationOfficer.Model.ExamRegistrationOfficer;
import oop_groupproject.britishcouncil.ExamRegistrationOfficer.Model.Registration;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class checkRegistrationController {
    @FXML private ComboBox<String> registrationIDComboBox;
    @FXML private Label statusLabel;

    @FXML
    public void initialize() {

        registrationIDComboBox.getItems().clear();

        for (Registration reg : ExamRegistrationOfficer.registrationList) {

            registrationIDComboBox.getItems().add(reg.registrationID);
        }

        if (ExamRegistrationOfficer.registrationList.isEmpty()) {
            registrationIDComboBox.setPromptText("No Registrations Found");
        }
    }

    @FXML
    void searchStatusButton() {
        String selectedID = registrationIDComboBox.getValue();

        if (selectedID != null) {
            String status = ExamRegistrationOfficer.getRegistrationStatus(selectedID);
            statusLabel.setText("Status: " + status);
        } else {
            statusLabel.setText("Status: Please select an ID");
        }
    }
}