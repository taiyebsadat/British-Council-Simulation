package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class U1G1VerifyStudentViewController {
    @FXML private Label statusLabel;
    @FXML
    private TextField verifyStudentIdTextField;

    @FXML
    public void verifyButtonOnAction(ActionEvent actionEvent) {
        String id = verifyStudentIdTextField.getText();
        if (id.isEmpty()){
            statusLabel.setText("Please enter an ID");
            return;
        }
        ArrayList<String> registeredList = new ArrayList<>();
        try {
            Helper.loadFrom("RegisteredStudents.bin", registeredList);
            if (registeredList.contains(id)) {
                statusLabel.setText("Verified: Student is eligible.");
            } else {
                statusLabel.setText("Error: Not found.");
            }
        } catch (IOException e) {
            Helper.showAlert("Database not found.");
        }
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "InvigilatorDashboard.fxml", "Invigilator Dashboard");
    }
}