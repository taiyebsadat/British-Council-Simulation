package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.util.ArrayList;

public class U1G8ViewNextAssignmentViewController
{
    @javafx.fxml.FXML
    private TextArea scheduleTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        loadScheduleData();
    }

    @javafx.fxml.FXML
    public void refreshScheduleButtonOnAction(ActionEvent actionEvent) {
        loadScheduleData();
    }
    private void loadScheduleData() {
        scheduleTextArea.clear();
        ArrayList<U1G8ViewNextAssignment> assignments = new ArrayList<>();

        try {
            Helper.loadFrom("Assignments.bin", assignments);

            if (assignments.isEmpty()) {
                scheduleTextArea.setText("No upcoming assignments found.");
            } else {
                for (U1G8ViewNextAssignment assignment : assignments) {
                    // Uses the model's toString() for clean formatting in the TextArea
                    scheduleTextArea.appendText(assignment.toString());
                }
            }
        } catch (IOException e) {
            scheduleTextArea.setText("Schedule file not found. Please contact the System Manager.");
        }
    }
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "InvigilatorDashboard.fxml", "Dashboard");
    }
}