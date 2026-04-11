package oop_groupproject.britishcouncil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class U2G5MonitorInvigilatorViewController
{

    @javafx.fxml.FXML
    private TableColumn<U1G7RequestMaterial, String> timeColumn;
    @javafx.fxml.FXML
    private TableView<U1G7RequestMaterial> requestTableView;
    @javafx.fxml.FXML
    private TableColumn<U1G7RequestMaterial, String> materialTypeColumn;

    @javafx.fxml.FXML
    public void initialize() {
        materialTypeColumn.setCellValueFactory(new PropertyValueFactory<>("materialType"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("requestTime"));
    }

    @javafx.fxml.FXML
    public void loadButtonOnAction(ActionEvent actionEvent) {
        ArrayList<U1G7RequestMaterial> requestList = new ArrayList<>();

        try {
            Helper.loadFrom("MaterialRequests.bin", requestList);
            ObservableList<U1G7RequestMaterial> observableList = FXCollections.observableList(requestList);

            requestTableView.setItems(observableList);

        } catch (IOException e){
            Helper.showAlert("Could not load request Records.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        Helper.changeScene(actionEvent, "SystemOperationsManagerDashboard.fxml","System Operations Manager Dashboard");
    }
}