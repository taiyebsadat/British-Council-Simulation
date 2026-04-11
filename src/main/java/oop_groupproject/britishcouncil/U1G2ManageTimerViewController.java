package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class U1G2ManageTimerViewController {
    @FXML private Label timerLabel;
    @FXML private TextField durationTextField;
    private int timeSeconds;

    @FXML
    public void startCountdownButtonOnAction(ActionEvent actionEvent) {
       /* try {
            int mins = Integer.parseInt(durationTextField.getText());
            timeSeconds = mins * 60;
            Helper.writeInto("TimerLogs.bin", new U1G2ManageTimer(LocalDateTime.now(), mins));

            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
                timeSeconds--;
                timerLabel.setText(String.format("%02d:%02d", timeSeconds / 60, timeSeconds % 60));
            }));
            timeline.setCycleCount(mins * 60);
            timeline.play();
        } catch (Exception e) {
            Helper.showAlert("Invalid duration.");
        }*/
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "InvigilatorDashboard.fxml", "Invigilator Dashboard");
    }
}