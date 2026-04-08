package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U2G1CreateAccountViewController {

    @FXML private TextField nameTextField;
    @FXML private TextField idTextField;
    @FXML private TextField emailTextField;
    @FXML private TextField phoneTextField;
    @FXML private Label resultLabel;

    @FXML
    public void createButtonOnAction() {

        try {
            String name = nameTextField.getText();
            int id = Integer.parseInt(idTextField.getText());
            String email = emailTextField.getText();
            String phone = phoneTextField.getText();

            U2G1CreateAccount obj =
                    new U2G1CreateAccount("",0,"",true,name,id,email,phone);

            resultLabel.setText(obj.createAccount());

        } catch (Exception e) {
            resultLabel.setText("Error occurred");
        }
    }
}