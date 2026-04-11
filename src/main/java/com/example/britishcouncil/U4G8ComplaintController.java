package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class U4G8ComplaintController
{
    @javafx.fxml.FXML
    private RadioButton registrationStatusconfirmRB;
    @javafx.fxml.FXML
    private ComboBox<Integer> trainingFeeCB;
    @javafx.fxml.FXML
    private DatePicker sessionDateDatePicker;
    @javafx.fxml.FXML
    private TextField candidateIdTF;
    @javafx.fxml.FXML
    private TextField sessionTittleTF;
    @javafx.fxml.FXML
    private RadioButton registrationStatuspendingRB;
    @FXML
    private ToggleGroup Stat;
    @FXML
    private Button BackButton;

    @FXML
    public void initialize() {

        trainingFeeCB.getItems().addAll(7000,9000);
        registrationStatuspendingRB.isSelected();
        registrationStatusconfirmRB.isSelected();

    }

    @javafx.fxml.FXML
    public void ApprovedButton(ActionEvent actionEvent) throws IOException {
        if (!sessionDateDatePicker.getValue().equals(2026)) {
            Helper.showAlert("session date must be start with 2026");
        }


        U4G8Complaint complaint=new U4G8Complaint(
                candidateIdTF.getText(),
                sessionTittleTF.getText(),
                Stat,
                sessionDateDatePicker.getValue(),
                trainingFeeCB.getValue());

         Helper.writeInto("allC.bin",complaint);
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashboardUser4-view.fxml"));

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("DashboardUser4");

        stage.show();
    }
}