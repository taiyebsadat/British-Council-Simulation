package oop_groupproject.britishcouncil;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.util.ArrayList;

public class U2G6ViewDataMarksViewController
{
    @javafx.fxml.FXML
    private TextArea dataDiplayTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void fetchDataButtonOnAction(ActionEvent actionEvent) {
        dataDiplayTextArea.clear();
        ArrayList<U2G6ViewDataMarks> marksList = new ArrayList<>();

        try{
            Helper.loadFrom("SudentMarks.bin", marksList);
            if (marksList.isEmpty()){
                dataDiplayTextArea.setText("No marks found.");
            } else {
                dataDiplayTextArea.appendText("Student Marks:\n\n");
                for (U2G6ViewDataMarks marks : marksList){
                    dataDiplayTextArea.appendText(marks.toString());
                }
            }
        } catch (IOException e){
            Helper.showAlert("Could not access marks.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "SystemOperationsManagerDashboard.fxml", "System Operations Manager Dashboard");
    }
}