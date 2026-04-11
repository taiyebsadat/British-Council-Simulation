package oop_groupproject.britishcouncil.IeltsCandidate.Controller;

import com.example.britishcouncil.IeltsCandidate.Model.Course;
import com.example.britishcouncil.IeltsCandidate.Model.IeltsCandidate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class enrollCourseController {
    @FXML private TableView<Course> courseDetailsTableView;
    @FXML private TableColumn<Course, String> courseIDCol, titleCol, schedule;
    @FXML private TableColumn<Course, Double> feeCol;

    @FXML
    public void initialize() {
        courseIDCol.setCellValueFactory(new PropertyValueFactory<>("courseID"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        feeCol.setCellValueFactory(new PropertyValueFactory<>("fee"));
        schedule.setCellValueFactory(new PropertyValueFactory<>("schedule"));
    }

    @FXML
    public void enrollButton(ActionEvent actionEvent) {
        Course selected = courseDetailsTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            IeltsCandidate.enrollInCourse(selected.courseID, selected.title, selected.fee, selected.description, selected.schedule);
            System.out.println("Enrolled in: " + selected.title);
        }
    }
}