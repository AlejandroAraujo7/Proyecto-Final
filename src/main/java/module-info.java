
module co.edu.uniquindio.proyecto_final.proyecto_final {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens co.edu.uniquindio.proyecto_final.proyecto_final to javafx.fxml;
    opens co.edu.uniquindio.proyecto_final.proyecto_final.viewcontroller to javafx.fxml;

    exports co.edu.uniquindio.proyecto_final.proyecto_final.viewcontroller;
    exports co.edu.uniquindio.proyecto_final.proyecto_final;

}