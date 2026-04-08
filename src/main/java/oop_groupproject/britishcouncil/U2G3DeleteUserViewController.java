package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U2G3DeleteUserViewController {

    @FXML private TextField idTextField;
    @FXML private Label resultLabel;

    @FXML
    public void deleteButtonOnAction() {

        try {
            int id = Integer.parseInt(idTextField.getText());

            U2G3DeleteUser obj =
                    new U2G3DeleteUser("",0,"",true,id);

            resultLabel.setText(obj.deleteUser());

        } catch (Exception e) {
            resultLabel.setText("Error occurred");
        }
    }
}