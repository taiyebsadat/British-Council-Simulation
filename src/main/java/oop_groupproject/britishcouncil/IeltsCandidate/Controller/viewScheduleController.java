package oop_groupproject.britishcouncil.IeltsCandidate.Controller;

import com.example.britishcouncil.IeltsCandidate.Model.IeltsCandidate;
import com.example.britishcouncil.IeltsCandidate.Model.ScheduleEntry;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class viewScheduleController {
    @FXML private TableView<ScheduleEntry> scheduleTable;
    @FXML private TableColumn<ScheduleEntry, String> dataCol, timeCol, couseCol;

    @FXML
    public void loadSheduleButton(ActionEvent actionEvent) {
        dataCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        couseCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));

        scheduleTable.getItems().setAll(IeltsCandidate.scheduleList);
    }
}