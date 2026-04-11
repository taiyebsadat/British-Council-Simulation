package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class U1G3TakeAttendanceViewController
{
    @javafx.fxml.FXML
    private CheckBox isPresentCheckBox;
    @javafx.fxml.FXML
    private TextField seatNoTextField;
    @javafx.fxml.FXML
    private TextField studentIdTextField;
    @javafx.fxml.FXML
    private Label confirmationLabel;

    @javafx.fxml.FXML
    public void initialize() {
        confirmationLabel.setText("");
    }

    @javafx.fxml.FXML
    public void saveAttendanceButtonOnAction(ActionEvent actionEvent) {
        String id = studentIdTextField.getText();
        String seat = seatNoTextField.getText();

        if (id.isEmpty() || seat.isEmpty()){
            confirmationLabel.setText("Error! Try Again.");
            return;
        }

        try {
            U1G3TakeAttendance record = new U1G3TakeAttendance(id, seat, isPresentCheckBox.isSelected());
            Helper.writeInto("AttendanceData.bin", record);
            confirmationLabel.setText("Attendance saved for: " + id);
        } catch (IOException e) {
            Helper.showAlert("Error saving attendance.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "InvigilatorDashboard.fxml", "Invigilator Dashboard");
    }

}