package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewController {

    @FXML
    private TextField userIdTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Label messageLabel;

    @FXML
    public void loginButtonOnAction(ActionEvent event) {

        int id = Integer.parseInt(userIdTextField.getText());
        String pass = passwordTextField.getText();

        Login login = new Login(id, pass);

        if (!login.validateFormat()) {
            messageLabel.setText("Invalid Format!");
            return;
        }

        if (login.verifyUser()) {
            messageLabel.setText("Login Success");

            switchScene(event, "InvigilatorDashboard.fxml");

        } else {
            messageLabel.setText("Wrong ID or Password");
        }
    }

    private void switchScene(ActionEvent event, String file) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(file));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}