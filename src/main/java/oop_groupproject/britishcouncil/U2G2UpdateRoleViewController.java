package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class U2G2UpdateRoleViewController
{
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> newRoleTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        newRoleTypeComboBox.getItems().addAll("Invigilator", "System Operations Manager", "IELTS Trainer", "Customer Support Executive", "IELTS Candidate","Exam Registration Officer", "Library Member", " Librarian");
    }

    @javafx.fxml.FXML
    public void updateButtonOnAction(ActionEvent actionEvent) {
        String targetId = userIdTextField.getText();
        String newRole = newRoleTypeComboBox.getValue();

        if (targetId.isEmpty() || newRole == null){
            Helper.showAlert("Provide both User ID and New Role.");
            return;
        }
        ArrayList<U2G1CreateUserAccount> userList = new ArrayList<>();
        boolean found = false;

        try {
            Helper.loadFrom("Users.bin", userList);

            for (U2G1CreateUserAccount user: userList){
                if (user.getUserId().equals(targetId)){
                    user.setRole("newRole");
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
                newRoleTypeComboBox.setValue(null);
            } else{
                Helper.showAlert("User ID "+ targetId + " not found");
            }
        } catch (IOException e){
            Helper.showAlert("Error updating database.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "SystemOperationsManagerDashboard.fxml", "System Operations Manager Dashboard");
    }
}