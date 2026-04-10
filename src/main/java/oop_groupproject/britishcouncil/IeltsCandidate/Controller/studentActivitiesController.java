package oop_groupproject.britishcouncil.IeltsCandidate.Controller;

import com.example.britishcouncil.IeltsCandidate.Model.IeltsCandidate;
import com.example.britishcouncil.IeltsCandidate.Model.Score;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class studentActivitiesController {
    @FXML private TableView<Score> scoreTable;
    @FXML private TableColumn<Score, String> testIdCol, bandCol;
    @FXML private TableColumn<Score, Double> scoreCol;

    @FXML
    public void loadScoresTable(ActionEvent actionEvent) {
        testIdCol.setCellValueFactory(new PropertyValueFactory<>("testId"));
        scoreCol.setCellValueFactory(new PropertyValueFactory<>("scoreValue"));
        bandCol.setCellValueFactory(new PropertyValueFactory<>("band"));

        scoreTable.getItems().setAll(IeltsCandidate.scoreList);
    }
}