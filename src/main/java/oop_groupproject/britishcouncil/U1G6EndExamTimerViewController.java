package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class U1G6EndExamTimerViewController
{
    @javafx.fxml.FXML
    private Label endExamConfirmation;

    @javafx.fxml.FXML
    public void initialize(

    ) {
    }

    @javafx.fxml.FXML
    public void endExamButtonOnAction(ActionEvent actionEvent) {
        try{}
        finally {
            //
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "InvigilatorDashboard.fxml", "Dashboard");
    }
}