package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U1G4ReportIncidentViewController {

    @FXML private TextField studentIdTextField;
    @FXML private TextField typeTextField;
    @FXML private TextArea descriptionTextArea;
    @FXML private Label resultLabel;

    @FXML
    public void submitButtonOnAction() {

        try {
            int id = Integer.parseInt(studentIdTextField.getText());
            String type = typeTextField.getText();
            String desc = descriptionTextArea.getText();

            U1G4ReportIncident obj =
                    new U1G4ReportIncident("",0,"",true,id,type,desc);

            resultLabel.setText(obj.saveReport());

        } catch (Exception e) {
            resultLabel.setText("Error occurred");
        }
    }
}