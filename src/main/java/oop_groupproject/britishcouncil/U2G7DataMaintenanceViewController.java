package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U2G7DataMaintenanceViewController {

    @FXML private Label resultLabel;

    @FXML
    public void cleanButtonOnAction() {

        U2G7DataMaintenance obj =
                new U2G7DataMaintenance("",0,"",true);

        resultLabel.setText(obj.cleanData());
    }
}