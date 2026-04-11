package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class U2G3DeleteUserViewController
{
    @javafx.fxml.FXML
    private Label deleteConfirmationLabel;
    @javafx.fxml.FXML
    private TextField userIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
        deleteConfirmationLabel.setText("");
    }

    @javafx.fxml.FXML
    public void confirmButtonOnAction(ActionEvent actionEvent) {
        String targetId = userIdTextField.getText();

        if (targetId.isEmpty()){
            deleteConfirmationLabel.setText("Please enter an User ID.");
            return;
        }

        ArrayList<U2G1CreateUserAccount> userList = new ArrayList<>();
        boolean userFound = false;

        try{
            Helper.loadFrom("Users.bin", userList);
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getUserId().equals(targetId)) {
                    userList.remove(i);
                    userFound = true;
                    break;
                }
            }
            if (userFound){
                new Helper().deleteFile("Users.bin");
                if (!userList.isEmpty()){
                    for (U2G1CreateUserAccount user : userList){
                        Helper.writeInto("Users.bin", user);
                    }
                }
                deleteConfirmationLabel.setText("User "+ targetId +" deleted successfully.");
                userIdTextField.clear();
            } else{
                deleteConfirmationLabel.setText("User ID not found.");
            }
        }  catch (IOException e){
            Helper.showAlert("Could not proccess deletion.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "SystemOperationsManagerDashboard.fxml", "System Operations Manager Dashboard");
    }
}