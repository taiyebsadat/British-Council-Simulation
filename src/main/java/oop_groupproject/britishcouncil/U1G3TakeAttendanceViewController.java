package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U1G3TakeAttendanceViewController {

    @FXML private TextField studentIdTextField;
    @FXML private TextField seatTextField;
    @FXML private ComboBox<String> statusComboBox;
    @FXML private Label resultLabel;

    @FXML
    public void saveButtonOnAction() {

        try {
            int id = Integer.parseInt(studentIdTextField.getText());
            int seat = Integer.parseInt(seatTextField.getText());
            String status = statusComboBox.getValue();

            U1G3TakeAttendance obj =
                    new U1G3TakeAttendance("",0,"",true,id,status,seat);

            resultLabel.setText(obj.saveAttendance());

        } catch (Exception e) {
            resultLabel.setText("Error occurred");
        }
    }
}