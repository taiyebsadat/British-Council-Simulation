package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class U3G4StudentFeedbackController
{
    @javafx.fxml.FXML
    private TextField trainerIdTextField;
    @javafx.fxml.FXML
    private TextField isVisibleTextField;
    @javafx.fxml.FXML
    private TextField studentNameTextField;
    @javafx.fxml.FXML
    private TextArea feedbackCommentsTextArea;
    @javafx.fxml.FXML
    private TextField studentIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> priorityLevelComboBox;

    @javafx.fxml.FXML
    public void initialize() {

        priorityLevelComboBox.getItems().addAll("low","high","medium");


    }

    @javafx.fxml.FXML
    public void SearchButton(ActionEvent actionEvent) throws IOException {

        if (!priorityLevelComboBox.getValue().startsWith("low")){
            Helper.showAlert("priority level must start with low");
        }

        U3G4StudentFeedback feedback=new U3G4StudentFeedback(
                trainerIdTextField.getText(),
                studentIdTextField.getText(),
                studentNameTextField.getText(),
                feedbackCommentsTextArea.getText(),
                priorityLevelComboBox.getValue(),
                isVisibleTextField.getText()
        );
           Helper.writeInto("allSF.bin",feedback);

    }

    @Deprecated
    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashboardUser3-view.fxml"));

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("DashboardUser3");

        stage.show();
    }
}