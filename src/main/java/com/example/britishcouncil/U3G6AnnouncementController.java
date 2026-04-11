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

public class U3G6AnnouncementController
{
    @javafx.fxml.FXML
    private TextArea messagebodyTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> targetAudienceComboBox;
    @javafx.fxml.FXML
    private TextField trainerIdTextField;
    @javafx.fxml.FXML
    private TextField subjectTextField;
    @javafx.fxml.FXML
    private TextField isLiveTextField;

    @javafx.fxml.FXML
    public void initialize() {

        targetAudienceComboBox.getItems().add("student");

    }

    @javafx.fxml.FXML
    public void AnnouncementButton(ActionEvent actionEvent) throws IOException {

        if (!targetAudienceComboBox.getValue().startsWith("student"))
            Helper.showAlert("target audience will be our student");

        U3G6Announcement announcements=new U3G6Announcement(
                trainerIdTextField.getText(),
                targetAudienceComboBox.getValue(),
                subjectTextField.getText(),
                messagebodyTextArea.getText(),
                isLiveTextField.getText()
        );
            Helper.writeInto("allA.bin",announcements);


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