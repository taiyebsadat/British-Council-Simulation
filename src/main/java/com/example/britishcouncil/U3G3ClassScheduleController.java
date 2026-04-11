package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class U3G3ClassScheduleController
{
    @javafx.fxml.FXML
    private DatePicker classDateDatePicker;
    @javafx.fxml.FXML
    private TextArea topicsToCoverTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> classTimeCB;
    @javafx.fxml.FXML
    private ComboBox<String> roomNumberCB;
    @javafx.fxml.FXML
    private TextField trainerIdTextField;

    @javafx.fxml.FXML
    public void initialize() {

        classTimeCB.getItems().addAll("8 am","12pm","2 pm");
        roomNumberCB.getItems().addAll("6013","5002","5012");


    }

    @javafx.fxml.FXML
    public void schedulebtn(ActionEvent actionEvent) throws IOException {

        if (!classTimeCB.getValue().startsWith("8 am"))
            Helper.showAlert("class time will start at 8 am");

       U3G3ClassSchedule schedule=new U3G3ClassSchedule(
               trainerIdTextField.getText(),
               classDateDatePicker.getValue(),
               classTimeCB.getValue(),
               roomNumberCB.getValue(),
               topicsToCoverTextArea.getText()




       );

           Helper.writeInto("allCS.bin",schedule);
    }

    @Deprecated
    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashboardUser3-view.fxml"));

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("DashboardUser3");

        stage.show();
    }
};