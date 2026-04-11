package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class U4G1StudentController
{
    @javafx.fxml.FXML
    private ComboBox<String> courseTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<U4G1Student,LocalDate> dobTableColumn;
    @javafx.fxml.FXML
    private TableColumn<U4G1Student,String> passportNumberTableColumn;
    @javafx.fxml.FXML
    private TextField passportNumberTextField;
    @javafx.fxml.FXML
    private TableView<U4G1Student> studentTableView;
    @javafx.fxml.FXML
    private TableColumn<U4G1Student,String> studentNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<U4G1Student,String> courseTypeTableColumn;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;
    @javafx.fxml.FXML
    private TextField emailAddressTextField;
    @javafx.fxml.FXML
    private TextField studentNameTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G1Student,String> emailAddressTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        courseTypeComboBox.getItems().addAll( "IELTS","ENGLISH","GRE");

        passportNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("passportNumber"));
        studentNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        courseTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("courseType"));
        emailAddressTableColumn.setCellValueFactory(new PropertyValueFactory<>("emailAddress"));
        dobTableColumn.setCellValueFactory(new PropertyValueFactory<>("dob"));
    }

    @javafx.fxml.FXML
    public void RegisterButton(ActionEvent actionEvent) throws IOException {

        if (!passportNumberTextField.getText().startsWith("EB")){
            Helper.showAlert("passportNumber must start with EB");
            return;
        }


        U4G1Student student = new U4G1Student(
                studentNameTextField.getText(),
                passportNumberTextField.getText(),
                courseTypeComboBox.getValue(),
                emailAddressTextField.getText(),
                dobDatePicker.getValue()
        );

        Helper.writeInto("allANS.bin",student);
        studentTableView.getItems().clear();


    }

     @javafx.fxml.FXML
    public void LoadButton(ActionEvent actionEvent) throws IOException {
        studentTableView.getItems().clear();
        ArrayList<U4G1Student> list = new ArrayList<>();
        Helper.loadFrom("allANS.bin", list);
        for (U4G1Student i : list){
            studentTableView.getItems().add(i);
        }
        list.clear();
    }

    @Deprecated
    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashboardUser4-view.fxml"));

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("DashboardUser4");

        stage.show();
    }
}