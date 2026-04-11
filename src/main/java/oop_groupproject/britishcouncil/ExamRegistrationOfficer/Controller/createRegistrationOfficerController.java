package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Controller;

import com.example.britishcouncil.ExamRegistrationOfficer.Model.ExamRegistrationOfficer;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class createRegistrationOfficerController {

    @FXML private TextField registrationIDTextField;
    @FXML private TextField examIDTextField;
    @FXML private TextField passportNumTextField;
    @FXML private TextField candidateIDTextField;
    @FXML private ComboBox<String> cmbStatus;


    @FXML
    public void initialize() {
        cmbStatus.getItems().addAll("Pending", "Confirmed", "Cancelled");
        cmbStatus.setValue("Pending");

        registrationIDTextField.setText("REG-" + (int)(Math.random() * 9000 + 1000));
        examIDTextField.setText("IELTS-2026-01");
    }

    @FXML
    void submitRegistrationButton() {
        String regID = registrationIDTextField.getText();
        String candID = candidateIDTextField.getText();
        String examID = examIDTextField.getText();
        String passport = passportNumTextField.getText();
        String status = cmbStatus.getValue();

        ExamRegistrationOfficer.createRegistration(regID, candID, examID,status ,passport);

        System.out.println("Registration Successful!");
        System.out.println("Current Total Registrations: " + ExamRegistrationOfficer.registrationList.size());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Registration Created for Candidate: " + candID);
        alert.showAndWait();
    }
}