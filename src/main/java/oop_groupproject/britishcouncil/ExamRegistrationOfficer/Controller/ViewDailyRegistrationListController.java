package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Controller;

import com.example.britishcouncil.IeltsCandidate.Model.IeltsCandidate;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewDailyRegistrationListController {
    @FXML private DatePicker listDateDatePicker;
    @FXML private TableView<IeltsCandidate> registrationTable;
    @FXML private TableColumn<IeltsCandidate, String> colIDCol, colNameCol;

    @FXML
    void ViewDailyRegistrationListButton() {
        colIDCol.setCellValueFactory(new PropertyValueFactory<>("candidateID"));
        colNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
    }
}