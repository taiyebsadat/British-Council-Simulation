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

public class U3G2MockTestScoreController
{
    @javafx.fxml.FXML
    private TextField TestIdTextField;
    @javafx.fxml.FXML
    private TextArea CommentTextArea;
    @javafx.fxml.FXML
    private TextField MarksTextField;
    @javafx.fxml.FXML
    private TextField StudentIdTextField;
    @javafx.fxml.FXML
    private DatePicker DateOfTestDatePicker;
    @javafx.fxml.FXML
    private TextField QuestionSetNoTextField;
    @javafx.fxml.FXML
    private TableColumn<U3G2MockTestScore,Float> MarksCol;
    @javafx.fxml.FXML
    private TableColumn<U3G2MockTestScore,Integer> StudentIdCol;
    @javafx.fxml.FXML
    private TableView<U3G2MockTestScore> GradeTableView;
    @javafx.fxml.FXML
    private TableColumn<U3G2MockTestScore,Character> GradeCol;

    @javafx.fxml.FXML
    public void initialize() {
        StudentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        MarksCol.setCellValueFactory(new PropertyValueFactory<>("Marks"));
        GradeCol.setCellValueFactory(new PropertyValueFactory<>("Grade"));


    }

    @javafx.fxml.FXML
    public void SaveButton(ActionEvent actionEvent) throws IOException {

         if (!StudentIdTextField.getText().startsWith("1")){
             Helper.showAlert("student id must start with 1");

         }
//        String comment, float marks,
//        LocalDate dateOfTest, String questionSetNo,
//        int studentId, int testId
        U3G2MockTestScore mtscore = new U3G2MockTestScore(
                CommentTextArea.getText(),
                Float.parseFloat(MarksTextField.getText()),
                DateOfTestDatePicker.getValue(),
                QuestionSetNoTextField.getText(),
                Integer.parseInt(StudentIdTextField.getText()),
                Integer.parseInt(TestIdTextField.getText())
        );
           Helper.writeInto("allMT.bin",mtscore);
           GradeTableView.getItems().clear();


    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashboardUser3-view.fxml"));

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("DashboardUser3");

        stage.show();
    }

    @javafx.fxml.FXML
    public void LoadButton(ActionEvent actionEvent) throws IOException {
        GradeTableView.getItems().clear();
        ArrayList<U3G2MockTestScore> list= new ArrayList<>();
        Helper.loadFrom("allMT.bin", list);
        for (U3G2MockTestScore i : list){
            GradeTableView.getItems().add(i);
        }
        list.clear();

    }
}