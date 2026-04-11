package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class U4G6ContactUpdateController
{
    @javafx.fxml.FXML
    private TextField studentNameTF;
    @javafx.fxml.FXML
    private TextField phoneNumberTF;
    @javafx.fxml.FXML
    private TextField studentIdTF;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void UpdateButton(ActionEvent actionEvent) throws IOException {

        if (!phoneNumberTF.getText().startsWith("017"))
            Helper.showAlert("phone number must be start with 017");


        U4G6ContactUpdate info=new U4G6ContactUpdate(
                studentNameTF.getText(),
                studentIdTF.getText(),
                phoneNumberTF.getText()
        );


            Helper.writeInto("allCU.bin",info);
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