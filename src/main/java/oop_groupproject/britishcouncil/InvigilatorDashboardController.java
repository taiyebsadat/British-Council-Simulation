package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class InvigilatorDashboardController {

    // U1G1: Verify Student
    @FXML
    private void goToVerifyButtonOnAction(ActionEvent event) {
        Helper.changeScene(event, "U1G1VerifyStudentView.fxml", "Verify Student Eligibility");
    }

    // U1G2: Manage Exam (Timer)
    @FXML
    private void goToManageTimerButtonOnAction(ActionEvent event) {
        Helper.changeScene(event, "U1G2ManageTimerView.fxml", "Manage Exam Timer");
    }

    // U1G3: Take Attendance
    @FXML
    private void goToTakeAttendanceButtonOnAction(ActionEvent event) {
        Helper.changeScene(event, "U1G3TakeAttendanceView.fxml", "Take Attendance");
    }

    // U1G4: Report Plagiarism (Incident)
    @FXML
    private void goToReportAttendanceButtonOnAction(ActionEvent event) {
        Helper.changeScene(event, "U1G4ReportIncidentView.fxml", "Report Incident");
    }

    // U1G5: Mark Script Submission
    @FXML
    private void goToMarkScriptSubmissionButtonOnAction(ActionEvent event) {
        Helper.changeScene(event, "U1G5MarkScriptSubmissionView.fxml", "Mark Script Submission");
    }

    // U1G6: End Exam
    @FXML
    private void goToEndExamButtonOnAction(ActionEvent event) {
        Helper.changeScene(event, "U1G6EndExamTimerView.fxml", "End Exam Session");
    }

    // U1G7: Request Material
    @FXML
    private void goToRequestMaterialButtonOnAction(ActionEvent event) {
        Helper.changeScene(event, "U1G7RequestMaterialView.fxml", "Request Exam Materials");
    }

    // U1G8: Next Assignment
    @FXML
    private void goToNextAssignmentButtonOnAction(ActionEvent event) {
        Helper.changeScene(event, "U1G8ViewNextAssignmentView.fxml", "View My Schedule");
    }

    // Logout
    @FXML
    private void logoutButtonOnAction(ActionEvent event) {
        // Assuming your login page is named LoginView.fxml
        Helper.changeScene(event, "LoginView.fxml", "Login");
    }
}