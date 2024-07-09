module home.example.bioadmin {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires spring.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires spring.context;
    requires lombok;

    exports home.example.bioadmin;
    opens home.example.bioadmin to javafx.fxml, spring.context, javafx.graphics, spring.core, spring.web;
    opens home.example.bioadmin.configuration to home.example.bioadmin;
}