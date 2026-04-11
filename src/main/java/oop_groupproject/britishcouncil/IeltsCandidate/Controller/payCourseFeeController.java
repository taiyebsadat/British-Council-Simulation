package oop_groupproject.britishcouncil.IeltsCandidate.Controller;

import oop_groupproject.britishcouncil.IeltsCandidate.Model.IeltsCandidate;
import oop_groupproject.britishcouncil.IeltsCandidate.Model.PaymentRecord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class payCourseFeeController {
    @FXML private TextField paymentIDTextField;
    @FXML private ComboBox<String> courseIDComboBox, paymentMethodComboBox;
    @FXML private DatePicker transactionDateDatePicker;
    @FXML private TableView<PaymentRecord> detailsTableView;
    @FXML private TableColumn<PaymentRecord, String> couseIDCol;
    @FXML private TableColumn<PaymentRecord, Double> amountCol;

    @FXML
    public void initialize() {
        paymentMethodComboBox.getItems().addAll("Credit Card", "Bkash", "Bank Transfer");
        courseIDComboBox.getItems().addAll("C101", "C102", "C103");

        couseIDCol.setCellValueFactory(new PropertyValueFactory<>("courseID"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
    }

    @FXML
    public void payFeeButton(ActionEvent actionEvent) {
        IeltsCandidate.addPayment(
                paymentIDTextField.getText(),
                courseIDComboBox.getValue(),
                paymentMethodComboBox.getValue(),
                transactionDateDatePicker.getValue(),
                15000.0
        );
        detailsTableView.getItems().setAll(IeltsCandidate.paymentList);
    }
}