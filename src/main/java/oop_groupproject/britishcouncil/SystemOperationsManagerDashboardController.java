package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SystemOperationsManagerDashboardController {

    @FXML
    public void initialize() {
        // Initialization logic if needed (e.g., welcoming the user)
    }

    @FXML
    public void goToCreateUserAccountButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "U2G1CreateUserAccountView.fxml", "Create User Account");
    }

    @FXML
    public void goToUpdateRoleButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "U2G2UpdateRoleView.fxml", "Update User Role");
    }

    @FXML
    public void goToDeleteUserButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "U2G3DeleteUserView.fxml", "Delete User");
    }

    @FXML
    public void goToResetPasswordButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "U2G4ResetPasswordView.fxml", "Reset Password");
    }

    @FXML
    public void goToMonitorInvigilatorButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "U2G5MonitorInvigilatorView.fxml", "Monitor Invigilator Requests");
    }

    @FXML
    public void goToViewDataMarksButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "U2G6ViewDataMarksView.fxml", "View Student Marks");
    }

    @FXML
    public void goToDataMaintenanceButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "U2G7DataMaintenanceView.fxml", "System Data Maintenance");
    }

    @FXML
    public void goToManageUserStatusButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "U2G8ManageUserStatusView.fxml", "Manage User Status");
    }

    @FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
        // Standard practice: return to the main login screen
        Helper.changeScene(actionEvent, "LoginView.fxml", "Login");
    }
}