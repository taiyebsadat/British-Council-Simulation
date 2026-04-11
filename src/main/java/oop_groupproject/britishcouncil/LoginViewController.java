package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class LoginViewController {

    @FXML private TextField userIdTextField;
    @FXML private PasswordField userPasswordField;

    // List to store dummy users
    private ArrayList<User> userDatabase = new ArrayList<>();

    @FXML
    public void initialize() {
        // Adding Dummy Data for testing
        userDatabase.add(new User("user10", "pass10", "Invigilator"));
        userDatabase.add(new User("user11","pass11","Invigilator"));

        userDatabase.add(new User("user20","pass20","System Operations Manager"));
        userDatabase.add(new User("user21","pass21","System Operations Manager"));
    }

    @FXML
    public void userLoginButtonOnAction(ActionEvent event) {
        String id = userIdTextField.getText();
        String pass = userPasswordField.getText();

        if (id.isEmpty() || pass.isEmpty()) {
            Helper.showAlert("Please enter both ID and Password.");
            return;
        }

        User authenticatedUser = null;

        // Simple validation logic
        for (User u : userDatabase) {
            if (u.getUserId().equals(id) && u.getPassword().equals(pass)) {
                authenticatedUser = u;
                break;
            }
        }

        if (authenticatedUser != null) {
            // Redirect based on role
            if (authenticatedUser.getRole().equals("Invigilator")) {
                Helper.changeScene(event, "InvigilatorDashboard.fxml", "Invigilator Dashboard");
            } else if (authenticatedUser.getRole().equals("System Operations Manager")) {
                Helper.changeScene(event, "SystemOperationsManagerDashboard.fxml", "System Manager Dashboard");
            }
        } else {
            Helper.showAlert("Invalid Credentials. Please try again.");
        }
    }
}

