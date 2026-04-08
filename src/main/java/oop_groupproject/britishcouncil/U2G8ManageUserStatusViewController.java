package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U2G8ManageUserStatusViewController {

    @FXML private TextField idTextField;
    @FXML private ComboBox<String> statusComboBox;
    @FXML private Label resultLabel;

    @FXML
    public void updateButtonOnAction() {

        try {
            int id = Integer.parseInt(idTextField.getText());
            boolean status = statusComboBox.getValue().equals("Enable");

            U2G8ManageUserStatus obj =
                    new U2G8ManageUserStatus("",0,"",true,id,status);

            resultLabel.setText(obj.updateStatus());

        } catch (Exception e) {
            resultLabel.setText("Error occurred");
        }
    }
}