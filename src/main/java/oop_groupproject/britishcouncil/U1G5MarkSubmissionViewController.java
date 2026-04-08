package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U1G5MarkSubmissionViewController {

    @FXML
    private TextField studentIdTextField;
    @FXML
    private Label resultLabel;

    @FXML
    public void submitButtonOnAction() {
        try {
            int id = Integer.parseInt(studentIdTextField.getText());

            U1G5MarkSubmission obj =
                    new U1G5MarkSubmission("",0,"",true,id);

            resultLabel.setText(obj.saveSubmission());

        } catch (Exception e) {
            resultLabel.setText("Error occurred");
        }
    }
}