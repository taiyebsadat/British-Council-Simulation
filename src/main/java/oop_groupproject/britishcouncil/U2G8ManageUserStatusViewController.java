package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class U2G8ManageUserStatusViewController {
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private Label resultLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateButtonOnAction(ActionEvent actionEvent) {
        String targetId = userIdTextField.getText();
        String newStatus = statusComboBox.getValue();

        if (targetId.isEmpty() || newStatus == null){
            resultLabel.setText("Fill all fields.");
        }
        ArrayList<U2G1CreateUserAccount> userList = new ArrayList<>();
        boolean found = false;

        try {
            Helper.loadFrom("Users.bin", userList);
            for (U2G1CreateUserAccount user: userList){
                if (user.getUserId().equals(targetId)){
                    user.setStatus(newStatus);
                    found = true;
                    break;
                }
            }
            if (found){
                new Helper().deleteFile("Users.bin");
                for (U2G1CreateUserAccount user : userList){
                    Helper.writeInto("Users.bin", user);
                }

                resultLabel.setText("Status updated to " + newStatus);
                userIdTextField.clear();
                statusComboBox.setValue(null);
            } else {
                resultLabel.setText("User ID not found");
            }
        } catch (IOException e){
            Helper.showAlert("Could not update status.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "SystemOperationsManagerDashboard.fxml", "Manager Dashboard");    }
}