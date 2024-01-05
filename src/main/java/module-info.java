module com.mycompany.firstapp {
    requires javafx.controls;
    requires javafx.fxml;
        requires java.sql;

    opens com.mycompany.firstapp to javafx.fxml;
    exports com.mycompany.firstapp;
     
}
