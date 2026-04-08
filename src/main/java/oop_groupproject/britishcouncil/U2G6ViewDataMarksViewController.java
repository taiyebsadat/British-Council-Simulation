package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U2G6ViewDataMarksViewController {

    @FXML private TextField idTextField;
    @FXML private TextArea resultTextArea;

    @FXML
    public void loadButtonOnAction() {

        try {
            int id = Integer.parseInt(idTextField.getText());

            U2G6ViewDataMarks obj =
                    new U2G6ViewDataMarks("",0,"",true,id);

            resultTextArea.setText(obj.getUserData());

        } catch (Exception e) {
            resultTextArea.setText("Error occurred");
        }
    }
}