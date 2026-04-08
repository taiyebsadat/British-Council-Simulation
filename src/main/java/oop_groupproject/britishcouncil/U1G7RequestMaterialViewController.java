package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U1G7RequestMaterialViewController {

    @FXML private TextField materialTextField;
    @FXML private TextField quantityTextField;
    @FXML private Label resultLabel;

    @FXML
    public void sendButtonOnAction() {

        try {
            String material = materialTextField.getText();
            int qty = Integer.parseInt(quantityTextField.getText());

            U1G7RequestMaterial obj =
                    new U1G7RequestMaterial("",0,"",true,material,qty);

            resultLabel.setText(obj.sendRequest());

        } catch (Exception e) {
            resultLabel.setText("Error occurred");
        }
    }
}