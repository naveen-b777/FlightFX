module com.example.flightfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    requires javafx.graphics;
    requires javafx.base;

    requires java.sql;
    requires java.datatransfer;


    opens com.example.flightfx to javafx.fxml;
    exports com.example.flightfx;
}