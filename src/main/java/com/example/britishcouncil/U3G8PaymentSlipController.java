package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class U3G8PaymentSlipController
{
    @javafx.fxml.FXML
    private ComboBox<String> yearComboBox;
    @javafx.fxml.FXML
    private TextField trainerIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> monthComboBox;
    @javafx.fxml.FXML
    private TextArea payslipTextTextArea;
    @FXML
    private TableView<U3G8PaymentSlip> paymentSlipTableView;
    @FXML
    private TableColumn<U3G8PaymentSlip,String> yearCol;
    @FXML
    private TableColumn<U3G8PaymentSlip,String> monthCol;
    @FXML
    private TableColumn<U3G8PaymentSlip,String> payslipTextCol;
    @FXML
    private TableColumn<U3G8PaymentSlip,String> trainerIdCol;

    @FXML
    public void initialize() {
        monthComboBox.getItems().addAll("jan","feb","march");
        yearComboBox.getItems().addAll("2024","2025","2026");
        trainerIdCol.setCellValueFactory(new PropertyValueFactory<>("trainerId"));
        monthCol.setCellValueFactory(new PropertyValueFactory<>("month"));
        yearCol.setCellValueFactory(new PropertyValueFactory<>("year"));
        payslipTextCol.setCellValueFactory(new PropertyValueFactory<>("payslipText"));
    }

    @javafx.fxml.FXML
    public void ViewPaySlipButton(ActionEvent actionEvent) throws IOException {

        if (!trainerIdTextField.getText().startsWith("2026"))
            Helper.showAlert("trainer id must start with 2026");

        U3G8PaymentSlip Slip= new U3G8PaymentSlip(
                trainerIdTextField.getText(),
                monthComboBox.getValue(),
                yearComboBox.getValue(),
                payslipTextTextArea.getText()
        );

        Helper.writeInto("allVPS.bin",Slip);
        paymentSlipTableView.getItems().clear();


    }

    @FXML
    public void LoadButton(ActionEvent actionEvent) throws IOException {
        paymentSlipTableView.getItems().clear();
        ArrayList<U3G8PaymentSlip> list= new ArrayList<>();
        Helper.loadFrom("allVPS.bin",list);
        for (U3G8PaymentSlip i:list){
            paymentSlipTableView.getItems().add(i);
        }
        list.clear();

    }

    @FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashboardUser3-view.fxml"));

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("DashboardUser3");

        stage.show();
    }
}