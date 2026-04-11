package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class U4G2AccountIssueController
{
    @javafx.fxml.FXML
    private ComboBox<String> issueTypeComboBox;
    @javafx.fxml.FXML
    private TextField userIdOrEmailTextField;
    @javafx.fxml.FXML
    private DatePicker creationDateDatePicker;
    @javafx.fxml.FXML
    private TextField ticketReferenceIdTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;

    @javafx.fxml.FXML
    public void initialize() {

        issueTypeComboBox.getItems().addAll("Login Issue","Account Locked","Profile Update");


    }

    @javafx.fxml.FXML
    public void SearchButton(ActionEvent actionEvent) throws IOException {

        if (!issueTypeComboBox.getValue().startsWith("Login Issue"))
            Helper.showAlert("issue type must be starts with login issue ");


        U4G2AccountIssue request= new U4G2AccountIssue(
                userIdOrEmailTextField.getText(),
                ticketReferenceIdTextField.getText(),
                issueTypeComboBox.getValue(),
                descriptionTextArea.getText(),
                creationDateDatePicker.getValue());

               Helper.writeInto("allAI.bin",request);
    }



    @Deprecated
    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashboardUser4-view.fxml"));

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("DashboardUser4");

        stage.show();
    }
}