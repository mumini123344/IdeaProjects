module com.example.java4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java4 to javafx.fxml;
    exports com.example.java4;
}