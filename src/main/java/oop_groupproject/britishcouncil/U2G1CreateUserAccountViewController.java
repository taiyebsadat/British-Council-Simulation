package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class U2G1CreateUserAccountViewController
{
    @javafx.fxml.FXML
    private TextField userContactTextField;
    @javafx.fxml.FXML
    private TextField userEmailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;
    @javafx.fxml.FXML
    private Label createAccountStatusLabel;
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private PasswordField userPasswordField;

    @javafx.fxml.FXML
    public void initialize() {
        roleComboBox.getItems().addAll("Invigilator", "System Operations Manager", "IELTS Trainer", "Customer Support Executive", "IELTS Candidate","Exam Registration Officer", "Library Member", " Librarian");
        createAccountStatusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void saveAccountButtonOnAction(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String id = userIdTextField.getText();
        String pass = userPasswordField.getText();
        String email = userEmailTextField.getText();
        String contact = userContactTextField.getText();
        String role = roleComboBox.getValue();
        String status = "Enable";

        if (name.isEmpty() || id.isEmpty() || email.isEmpty() || contact.isEmpty() || role == null){
            createAccountStatusLabel.setText("Any field cannot be empty");
            return;
        }
        try{
            U2G1CreateUserAccount newUser = new U2G1CreateUserAccount(id, name, pass, email,contact, role, status);
            Helper.writeInto("Users.bin", newUser);
            createAccountStatusLabel.setText("Account created for " + name +" as "+ role +" | ID: "+id);

            nameTextField.clear();
            userPasswordField.clear();
            userIdTextField.clear();
            userEmailTextField.clear();
            userContactTextField.clear();
            roleComboBox.setValue(null);

        }catch (IOException e){
            Helper.showAlert("Failed to create account");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "SystemOperationsManagerDashboard.fxml", "System Operations Manager Dashbhoard");
    }
}