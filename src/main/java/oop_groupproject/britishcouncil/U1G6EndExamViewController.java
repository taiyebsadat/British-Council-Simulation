package oop_groupproject.britishcouncil;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U1G6EndExamViewController {

    @FXML private Label resultLabel;

    @FXML
    public void endExamButtonOnAction() {

        U1G6EndExam obj =
                new U1G6EndExam("",0,"",true,true);

        resultLabel.setText(obj.endExam());
    }
}