package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class U2G4ResetPasswordViewController
{
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private PasswordField newPasswordField;
    @javafx.fxml.FXML
    private Label resetPasswordStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        resetPasswordStatusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void savePasswordButtonOnAction(ActionEvent actionEvent) {
        String targetId = userIdTextField.getText();
        String newPass = newPasswordField.getText();

        if (targetId.isEmpty() || newPass.isEmpty()){
            Helper.showAlert("Any field can not be empty.");
            return;
        }
        ArrayList<U2G1CreateUserAccount> userList = new ArrayList<>();
        boolean found = false;

        try {
            Helper.loadFrom("Users.bin", userList);
            for (U2G1CreateUserAccount user : userList){
                if (user.getUserId().equals(targetId)){
                    user.setPass(newPass);
                    found = true;
                    break;
                }
            }
            if (found){
                new Helper().deleteFile("Users.bin");
                for (U2G1CreateUserAccount user : userList){
                    Helper.writeInto("Users.bin", user);
                }
                userIdTextField.clear();
                newPasswordField.clear();
                resetPasswordStatusLabel.setText("Password reset successful for: " + targetId);
            } else{
                Helper.showAlert("User ID not found.");
            }
        } catch (IOException e){
            Helper.showAlert("Error accessing database.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "SystemOperationsManagerDashboard.fxml", "System Operations Manager Dashboard");

    }
}