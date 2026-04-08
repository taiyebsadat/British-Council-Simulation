package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U2G5MonitorInvigilatorViewController {

    @FXML private TextArea outputTextArea;

    @FXML
    public void loadButtonOnAction() {

        U2G5MonitorInvigilator obj =
                new U2G5MonitorInvigilator("",0,"",true);

        outputTextArea.setText(obj.viewStatus());
    }
}