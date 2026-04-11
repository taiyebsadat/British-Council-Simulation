package oop_groupproject.britishcouncil.IeltsCandidate.Controller;

import oop_groupproject.britishcouncil.IeltsCandidate.Model.IeltsCandidate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class downloadInvoiceController {
    @FXML private TextField paymentIDTextField;

    @FXML
    public void downloadButton(ActionEvent actionEvent) {
        String id = paymentIDTextField.getText();
        IeltsCandidate.downloadInvoice(id);
    }
}