package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class U4G5PaymentRecordController
{

    @javafx.fxml.FXML
    private ComboBox<Integer> amountCB;
    @javafx.fxml.FXML
    private CheckBox statusunpaidCheckBox;
    @javafx.fxml.FXML
    private TextField studentIdTF;
    @javafx.fxml.FXML
    private TextField transactionIdTF;
    @javafx.fxml.FXML
    private CheckBox statuspaidCheckBox;


    @FXML
    public void initialize() {

    amountCB.getItems().addAll(7000,9000,11000);

    }

    @javafx.fxml.FXML
    public void UpdateButton(ActionEvent actionEvent) throws IOException {
        if (!studentIdTF.getText().startsWith("2022"))
         Helper.showAlert("student id must be start with 2022");


        U4G5PaymentRecord status=new U4G5PaymentRecord(
                transactionIdTF.getText(),
                studentIdTF.getText(),
                statuspaidCheckBox.isSelected(),
                statusunpaidCheckBox.isSelected(),
                amountCB.getValue()



        );

           Helper.writeInto("allPR.bin",status);


    }

    @javafx.fxml.FXML
    public void SearchButton(ActionEvent actionEvent) {



    }

    @Deprecated

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