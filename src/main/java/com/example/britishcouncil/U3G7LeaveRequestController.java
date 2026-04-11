package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class U3G7LeaveRequestController
{
    @javafx.fxml.FXML
    private DatePicker endDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> leaveReasonComboBox;
    @javafx.fxml.FXML
    private TextField trainerIdTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private DatePicker startDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        leaveReasonComboBox.getItems().addAll("Sick","Vacation","Urgent");

    }

    @javafx.fxml.FXML
    public void SubmitButton(ActionEvent actionEvent) throws IOException {

        if (!leaveReasonComboBox.getValue().startsWith("Sick"))
            Helper.showAlert("leave reason must start with sick");


//        (String trainerId, String startDate, String endDate,
//                String leaveReason, String description, String status)
        U3G7LeaveRequest l = new U3G7LeaveRequest(
                trainerIdTextField.getText(),
                startDateDatePicker.getValue(),
                endDateDatePicker.getValue(),
                leaveReasonComboBox.getValue(),
                descriptionTextArea.getText(),
                "Pending"
        );
            Helper.writeInto("allLR.bin",l);
    }

    @Deprecated
    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashboardUser3-view.fxml"));

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("DashboardUser3");

        stage.show();
    }
}