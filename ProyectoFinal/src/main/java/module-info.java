module co.edu.uniquindio.poo.proyectofinal.proyectofinal {
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

    opens co.edu.uniquindio.poo.proyectofinal.proyectofinal to javafx.fxml;
    exports co.edu.uniquindio.poo.proyectofinal.proyectofinal;

    opens co.edu.uniquindio.poo.proyectofinal.proyectofinal.viewcontroller;
    exports co.edu.uniquindio.poo.proyectofinal.proyectofinal.viewcontroller;
}