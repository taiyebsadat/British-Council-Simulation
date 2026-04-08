package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class U2G2UpdateRoleViewController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField roleTextField;
    @javafx.fxml.FXML
    private Label resultLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateButtonOnAction() {

        int id = Integer.parseInt(idTextField.getText());
        String role = roleTextField.getText();

        U2G2UpdateRole obj = new U2G2UpdateRole("",0,"",true,id,role);

        resultLabel.setText(obj.assignRole());
    }
}