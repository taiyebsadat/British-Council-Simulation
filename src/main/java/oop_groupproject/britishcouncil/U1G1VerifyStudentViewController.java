package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class U1G1VerifyStudentViewController {

    @FXML private TextField studentIdTextField;
    @FXML private Label resultLabel;

    @FXML
    public void verifyButtonOnAction() {

        try {
            int id = Integer.parseInt(studentIdTextField.getText());

            if (String.valueOf(id).length() != 7) {
                resultLabel.setText("Invalid ID format");
                return;
            }

            U1G1VerifyStudent model = new U1G1VerifyStudent("",0,"",true,id);
            String result = model.verify();

            resultLabel.setText(result);

        } catch (Exception e) {
            resultLabel.setText("Error occurred");
        }
    }

    @FXML
    public void backButtonOnAction() {
        try {
            Stage stage = (Stage) studentIdTextField.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("User2Dashboard.fxml"))));
        } catch (Exception e) { e.printStackTrace(); }
    }
}