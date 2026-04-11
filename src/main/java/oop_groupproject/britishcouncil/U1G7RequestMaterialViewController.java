package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;

import java.io.IOException;

public class U1G7RequestMaterialViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> materialComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        materialComboBox.getItems().addAll(
                "Extra Answer Script",
                "Graph Paper",
                "OMR Sheet",
                "Pen",
                "Scientific Calculator"
        );
    }

    @javafx.fxml.FXML
    public void sendRequestButtonOnAction(ActionEvent actionEvent) {
        String selectedMaterials = materialComboBox.getValue();

        if (selectedMaterials == null || selectedMaterials.isEmpty()){
            Helper.showAlert("Complete the fields properly");
            return;
        }

        try {
            // 1. Create Model Instance (DP)
            U1G7RequestMaterial request = new U1G7RequestMaterial(selectedMaterials);

            // 2. Write to Binary File using your Helper
            // Manager (User 2) will read this file in U2G5
            Helper.writeInto("MaterialRequests.bin", request);

            // 3. Optional: Clear selection and show success
            materialComboBox.setValue(null);

        } catch (IOException e) {
            Helper.showAlert("Error saving request");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "InvigilatorDashboard.fxml", "Dashboard");
    }
}