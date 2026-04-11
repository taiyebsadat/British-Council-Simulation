package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class U1G4ReportIncidentViewController
{
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TextField studentIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> incidentTypeComboBox;
    @javafx.fxml.FXML
    private Label reportStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        reportStatusLabel.setText("");
        incidentTypeComboBox.getItems().addAll("Cheating", "Health Emergency", "Technical Issue", "Disruptive Behaviour", "Others");
    }

    @javafx.fxml.FXML
    public void submitReportButtonOnAction(ActionEvent actionEvent) {
        String id = studentIdTextField.getText();
        String type = incidentTypeComboBox.getValue();
        String desc = descriptionTextArea.getText();

        if (id.isEmpty() || type == null) {
            Helper.showAlert("ID can not be empty");
            return;
        }
        try {
            U1G4ReportIncident incident = new U1G4ReportIncident(id, type, desc);
            Helper.writeInto("IncidentReports.bin", incident);
            reportStatusLabel.setText("Incident Reported");

            studentIdTextField.clear();
            descriptionTextArea.clear();
            incidentTypeComboBox.setValue(null);
        } catch (IOException e) {
            Helper.showAlert("Error submitting report.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "InvigilatorDashboard.fxml", "Dashboard");
    }
}