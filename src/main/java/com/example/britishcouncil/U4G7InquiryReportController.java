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

public class U4G7InquiryReportController
{
    @javafx.fxml.FXML
    private ComboBox<String> priorityCB;
    @javafx.fxml.FXML
    private TableColumn<U4G7InquiryReport, String> statusCol;
    @javafx.fxml.FXML
    private TextField reportIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> categoryCB;
    @javafx.fxml.FXML
    private TextField aoTF;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private TableColumn<U4G7InquiryReport, LocalDate> createdDateCol;
    @javafx.fxml.FXML
    private TableView<U4G7InquiryReport> table;
    @javafx.fxml.FXML
    private TableColumn<U4G7InquiryReport, String> reportIdCol;

    @javafx.fxml.FXML
    public void initialize() {
        categoryCB.getItems().addAll("Exam","English Course", "Study Uk", "Library" );
        priorityCB.getItems().addAll("Low","Medium", "High");

        reportIdCol.setCellValueFactory(new PropertyValueFactory<>("ReportId"));
        createdDateCol.setCellValueFactory(new PropertyValueFactory<>("createdDate"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) throws IOException {


        if (!reportIdTF.getText().startsWith("BC")){
            Helper.showAlert("Report id must start with BC");
            return;

        }


        U4G7InquiryReport report = new U4G7InquiryReport(
                reportIdTF.getText(),
                categoryCB.getValue(),
                priorityCB.getValue(),
                "Pending",
                aoTF.getText(),
                descriptionTA.getText(),
                LocalDate.now());

        Helper.writeInto("allDIR.bin", report);
        table.getItems().clear();

    }

    @javafx.fxml.FXML
    public void load(ActionEvent actionEvent) throws IOException {
        table.getItems().clear();
        ArrayList<U4G7InquiryReport> list = new ArrayList<>();
        Helper.loadFrom("allDIR.bin", list);
        for (U4G7InquiryReport i : list){
            // if (i.session = searchSession.getText ) {}
            table.getItems().add(i);
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