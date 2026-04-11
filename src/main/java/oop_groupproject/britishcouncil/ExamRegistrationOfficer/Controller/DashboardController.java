package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class DashboardController {

    private void openWindow(String fxmlFile, String title) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/oop_groupproject/britishcouncil/ExamRegistrationOfficer/" + fxmlFile));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            System.err.println("Could not load window: " + fxmlFile);
            e.printStackTrace();
        }
    }

    @FXML
    void handleCreateRegistration(ActionEvent event) {
        openWindow("CreateRegistration.fxml", "New Registration");
    }

    @FXML
    void handleCheckStatus(ActionEvent event) {
        openWindow("CheckRegistrationStatus.fxml", "Registration Status");
    }

    @FXML
    void handleAssignSession(ActionEvent event) {
        openWindow("AssignExamSession.fxml", "Assign Session");
    }

    @FXML
    void handleUpdateInfo(ActionEvent event) {
        openWindow("UpdateCandidateInfo.fxml", "Update Info");
    }

    @FXML
    void handleDailyList(ActionEvent event) {
        openWindow("ViewDailyRegistrationList.fxml", "Daily Registration List");
    }

    @FXML
    void handleGenerateSlip(ActionEvent event) {
        openWindow("GenerateRegistrationSlip.fxml", "Generate Slip");
    }

    @FXML
    void handleCancelReg(ActionEvent event) {
        openWindow("CancelRegistration.fxml", "Cancel Registration");
    }

    @FXML
    void handleRoomAllocation(ActionEvent event) {
        openWindow("FinalizeRoomAllocation.fxml", "Room Allocation");
    }
}