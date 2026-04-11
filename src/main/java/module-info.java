module com.example.britishcouncil {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;
    requires jdk.javadoc;


    opens com.example.britishcouncil to javafx.fxml;
    exports com.example.britishcouncil;
}