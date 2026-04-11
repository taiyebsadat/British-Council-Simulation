package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class U2G7DataMaintenanceViewController
{
    @javafx.fxml.FXML
    private TextArea logTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        logTextArea.setText("System Ready for Maintenance.../n");
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "SystemOperationsManagerDashboard.fxml", "Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void cleanupButtonOnAction(ActionEvent actionEvent) {
        try {
            new Helper().deleteFile("MaterialRequests.bin");

            U2G7DataMaintenance log = new U2G7DataMaintenance("Database cleanup", "Success");
            Helper.writeInto("MaintenanceHistory.bin", log);

            logTextArea.appendText(log.toString());
            logTextArea.appendText("Temporary reqruests cleared.");
        } catch(IOException e){
            logTextArea.appendText("Error during maintenance.");
        }
    }
}