module com.pumpmonitor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.pumpmonitor to javafx.fxml;
    exports com.pumpmonitor;
}