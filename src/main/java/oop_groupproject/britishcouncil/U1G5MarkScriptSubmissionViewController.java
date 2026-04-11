package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class U1G5MarkScriptSubmissionViewController
{
    @javafx.fxml.FXML
    private TextField studentIdTextField;
    @javafx.fxml.FXML
    private Label confirmSubmissionLabel;

    @javafx.fxml.FXML
    public void initialize() {
        confirmSubmissionLabel.setText("");
    }

    @javafx.fxml.FXML
    public void markSubmissionButtonOnAction(ActionEvent actionEvent) {
        String id = studentIdTextField.getText();

        if (id.isEmpty()){
            confirmSubmissionLabel.setText("Error: Enter ID");
            return;
        }
        try {
            Helper.writeInto("Submissions.bin", new U1G5MarkScriptSubmission(id));
            confirmSubmissionLabel.setText("Submitted: " + id);
            studentIdTextField.clear();
        } catch (IOException e) {
            Helper.showAlert("Error logging submission.");
        }
    }

    @javafx.fxml.FXML
    public void backButonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "InvigilatorDashboard.fxml", "Dashboard");
    }
}