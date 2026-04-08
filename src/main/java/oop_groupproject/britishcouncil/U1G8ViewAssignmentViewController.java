package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U1G8ViewAssignmentViewController {

    @FXML private Label resultLabel;

    @FXML
    public void loadButtonOnAction() {

        U1G8ViewAssignment obj =
                new U1G8ViewAssignment("",0,"",true);

        resultLabel.setText(obj.viewAssignment());
    }
}