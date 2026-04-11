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

public class U4G4FAQController
{
    @javafx.fxml.FXML
    private TextField questionTextField;
    @javafx.fxml.FXML
    private ComboBox<String> categoryCB;
    @javafx.fxml.FXML
    private ComboBox<String> updateByCB;
    @javafx.fxml.FXML
    private TextArea answerTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        categoryCB.getItems().addAll("inquiry","registration","fee","course");
        updateByCB.getItems().addAll("updateBy");
    }

    @javafx.fxml.FXML
    public void SaveButton(ActionEvent actionEvent) throws IOException {

        if (!categoryCB.getValue().startsWith("inquiry"))
            Helper.showAlert("faq category must be start with inquiry");


        U4G4FAQ faq=new U4G4FAQ(
                questionTextField.getText(),
                answerTextArea.getText(),
                categoryCB.getValue(),
                updateByCB.getValue()

        );

           Helper.writeInto("allF.bin",faq);

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