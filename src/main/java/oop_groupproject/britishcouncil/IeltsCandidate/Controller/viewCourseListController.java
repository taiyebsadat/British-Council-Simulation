package oop_groupproject.britishcouncil.IeltsCandidate.Controller;

import oop_groupproject.britishcouncil.IeltsCandidate.Model.Course;
import oop_groupproject.britishcouncil.IeltsCandidate.Model.IeltsCandidate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class viewCourseListController {
    @FXML private TableView<Course> courseTable;
    @FXML private TableColumn<Course, String> couseIDCol, titleCol, discriptionCol, ScheduleCol;
    @FXML private TableColumn<Course, Double> freeCol; // 'freeCol' maps to Fee in FXML

    @FXML
    public void loadCourseButton(ActionEvent actionEvent) {
        couseIDCol.setCellValueFactory(new PropertyValueFactory<>("courseID"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        freeCol.setCellValueFactory(new PropertyValueFactory<>("fee"));
        discriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        ScheduleCol.setCellValueFactory(new PropertyValueFactory<>("schedule"));

        courseTable.getItems().setAll(IeltsCandidate.enrolledCourses);
    }
}