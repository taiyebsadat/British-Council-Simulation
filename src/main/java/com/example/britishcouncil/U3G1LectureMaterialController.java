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
import java.sql.ClientInfoStatus;

public class U3G1LectureMaterialController
{
    @javafx.fxml.FXML
    private TextField trainerIdTextField;
    @javafx.fxml.FXML
    private TextField materialTittleTextField;
    @javafx.fxml.FXML
    private ComboBox<String> batchIdComboBox;
    @javafx.fxml.FXML
    private TextArea contentDescriptionTextArea;
    @javafx.fxml.FXML
    private TextField filePathTextField;

    @javafx.fxml.FXML
    public void initialize() {

        batchIdComboBox.getItems().addAll("123","321","210","403");
    }

    @javafx.fxml.FXML
    public void UploadBtn(ActionEvent actionEvent) throws IOException {

        if (trainerIdTextField.getText().startsWith("2026")){
            Helper.showAlert("trainer id must start with 2026");
            return;
        }



        U3G1LectureMaterial material=new U3G1LectureMaterial(
                trainerIdTextField.getText(),
                batchIdComboBox.getValue(),
                materialTittleTextField.getText(),
                contentDescriptionTextArea.getText(),
                filePathTextField.getText()
        );
           Helper.writeInto("allLM.bin",material);
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