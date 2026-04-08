package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U2G4ResetPasswordViewController {

    @FXML private TextField idTextField;
    @FXML private PasswordField passwordField;
    @FXML private Label resultLabel;

    @FXML
    public void resetButtonOnAction() {

        try {
            int id = Integer.parseInt(idTextField.getText());
            String pass = passwordField.getText();

            U2G4ResetPassword obj =
                    new U2G4ResetPassword("",0,"",true,id,pass);

            resultLabel.setText(obj.resetPassword());

        } catch (Exception e) {
            resultLabel.setText("Error occurred");
        }
    }
}