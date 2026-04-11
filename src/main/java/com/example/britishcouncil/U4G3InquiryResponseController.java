package com.example.britishcouncil;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class U4G3InquiryResponseController
{
    @javafx.fxml.FXML
    private TextField senderNameTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G3InquiryResponse,String> inquiryIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<U4G3InquiryResponse,String> StatusTableColumn;
    @javafx.fxml.FXML
    private TextArea queryTextTextArea;
    @javafx.fxml.FXML
    private TableView<U4G3InquiryResponse> inquiryTableView;
    @javafx.fxml.FXML
    private TextArea responseTextTextArea;
    @javafx.fxml.FXML
    private TextField resolutionTimeTextField;
    @javafx.fxml.FXML
    private TextField inquiryidTextField;
    @javafx.fxml.FXML
    private RadioButton statusResolvedRadioButton;
    @javafx.fxml.FXML
    private ToggleGroup Stat;

    @javafx.fxml.FXML
    public void initialize() {

        inquiryIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("inquiryId"));
        StatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));

    }

    @Deprecated
    public void ResolvedButton(ActionEvent actionEvent) throws IOException {

        if (!inquiryidTextField.getText().startsWith("IN226"))
          Helper.showAlert("inquiry id must be start with IN226");



        U4G3InquiryResponse inquiries=new U4G3InquiryResponse(
                inquiryidTextField.getText(),
                senderNameTextField.getText(),
                queryTextTextArea.getText(),
                responseTextTextArea.getText(),
                statusResolvedRadioButton.isSelected(),
                resolutionTimeTextField.getText());


        Helper.writeInto("allRI.bin",inquiries);
        inquiryTableView.getItems().clear();

    }

    @javafx.fxml.FXML
    public void LoadButton(ActionEvent actionEvent) throws IOException {
        inquiryTableView.getItems().clear();
        ArrayList<U4G3InquiryResponse> list=new ArrayList<U4G3InquiryResponse>();
        Helper.loadFrom("allCRI.bin",list);
        for (U4G3InquiryResponse i:list){
            inquiryTableView.getItems().add(i);
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