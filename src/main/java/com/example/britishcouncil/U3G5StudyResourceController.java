package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class U3G5StudyResourceController
{
    @javafx.fxml.FXML
    private TextField trainerIdTextfield;
    @javafx.fxml.FXML
    private TextField resourceLinkTextField;
    @javafx.fxml.FXML
    private ComboBox<String> batchIdComboBox;

    @javafx.fxml.FXML
    public void initialize() {

        batchIdComboBox.getItems().addAll("301","302","303","304","305");
    }

    @javafx.fxml.FXML
    public void PostButton(ActionEvent actionEvent) throws IOException {

        if (!resourceLinkTextField.getText().startsWith("http"))
            Helper.showAlert("Link should be start with any text not null");




//        String trainerId, String batchId, LocalDate postDate, String resourceLink
        U3G5StudyResource psrLink = new U3G5StudyResource(
                trainerIdTextfield.getText(),
                batchIdComboBox.getValue(),
                LocalDate.now(),
                resourceLinkTextField.getText()
        );

             Helper.writeInto("allSR.bin",psrLink);

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
