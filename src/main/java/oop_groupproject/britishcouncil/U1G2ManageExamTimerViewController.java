package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class U1G2ManageExamTimerViewController {

    @FXML private TextField durationTextField;
    @FXML private Label statusLabel;

    private U1G2ManageExamTimer timer = new U1G2ManageExamTimer("",0,"",true);

    @FXML
    public void startButtonOnAction() {
        try {
            int duration = Integer.parseInt(durationTextField.getText());
            statusLabel.setText(timer.startTimer(duration));
        } catch (Exception e) {
            statusLabel.setText("Invalid input");
        }
    }

    @FXML
    public void stopButtonOnAction() {
        statusLabel.setText(timer.stopTimer());
    }

    @FXML
    public void checkButtonOnAction() {
        statusLabel.setText(timer.getRemainingTime());
    }

    @FXML
    public void backButtonOnAction() {
        try {
            Stage stage = (Stage) durationTextField.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("User2Dashboard.fxml"))));
        } catch (Exception e) { e.printStackTrace(); }
    }
}