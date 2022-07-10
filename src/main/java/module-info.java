module com.example.testjavafx {
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
    requires org.apache.jena.arq;
    requires org.apache.jena.core;
    requires jena.arq;
    requires jena.core;

    opens com.javaproject to javafx.fxml;
    exports com.javaproject;
    exports com.javaproject.controller;
    opens com.javaproject.controller to javafx.fxml;
}