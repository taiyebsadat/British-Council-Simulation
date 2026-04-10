package oop_groupproject.britishcouncil.IeltsCandidate.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class CandidateDashboardController {

    private void openWindow(String fxmlFile, String title) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/britishcouncil/IeltsCandidate/" + fxmlFile));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            System.err.println("Error loading: " + fxmlFile);
            e.printStackTrace();
        }
    }

    @FXML
    void handleEnrollCourse(ActionEvent event) {
        openWindow("enrollCourse.fxml", "Course Enrollment");
    }

    @FXML
    void handleViewCourses(ActionEvent event) {
        openWindow("viewCourseList.fxml", "Available Courses");
    }

    @FXML
    void handleViewSchedule(ActionEvent event) {
        openWindow("viewSchedule.fxml", "My Class Schedule");
    }

    @FXML
    void handleSubmitHomework(ActionEvent event) {
        openWindow("submitHomework.fxml", "Homework Submission");
    }

    @FXML
    void handleStartMockTest(ActionEvent event) {
        openWindow("startMockTest.fxml", "Online Mock Test");
    }

    @FXML
    void handleViewScores(ActionEvent event) {
        openWindow("studentActivities.fxml", "My Scores & Performance");
    }

    @FXML
    void handlePayFee(ActionEvent event) {
        openWindow("payCourseFee.fxml", "Payment Portal");
    }

    @FXML
    void handleDownloadInvoice(ActionEvent event) {
        openWindow("downloadInvoice.fxml", "Invoice Management");
    }
}