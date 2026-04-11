package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    void onOfficerDashClick(ActionEvent event) {
        // Path to the Officer Dashboard FXML
        switchScene(event, "/oop_groupproject/britishcouncil/ExamRegistrationOfficer/Dashboad.fxml", "Officer Dashboard");
    }

    @FXML
    void onCandidateDashClick(ActionEvent event) {
        // Path to the Candidate Dashboard FXML (Assumed path)
        switchScene(event, "/oop_groupproject/britishcouncil/IeltsCandidate/CandidateDashboard.fxml", "Candidate Dashboard");
    }

    private void switchScene(ActionEvent event, String fxmlPath, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());

            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.println("Error loading: " + fxmlPath);
            e.printStackTrace();
        }
    }
}