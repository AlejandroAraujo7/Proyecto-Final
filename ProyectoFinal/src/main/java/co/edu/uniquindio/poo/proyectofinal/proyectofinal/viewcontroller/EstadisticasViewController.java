package co.edu.uniquindio.poo.proyectofinal.proyectofinal.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class EstadisticasViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox btnAgregarAlCarro1;

    @FXML
    private CheckBox btnAgregarAlCarro2;

    @FXML
    private Tab btnEstadisticas;

    @FXML
    private Tab btnMuro;

    @FXML
    private TextField txtBuscar;

    @FXML
    void onAgregarAlCarro1(ActionEvent event) {

    }

    @FXML
    void onAgregarAlCarro2(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnAgregarAlCarro1 != null : "fx:id=\"btnAgregarAlCarro1\" was not injected: check your FXML file 'Menu_Estadisticas.fxml'.";
        assert btnAgregarAlCarro2 != null : "fx:id=\"btnAgregarAlCarro2\" was not injected: check your FXML file 'Menu_Estadisticas.fxml'.";
        assert btnEstadisticas != null : "fx:id=\"btnEstadisticas\" was not injected: check your FXML file 'Menu_Estadisticas.fxml'.";
        assert btnMuro != null : "fx:id=\"btnMuro\" was not injected: check your FXML file 'Menu_Estadisticas.fxml'.";
        assert txtBuscar != null : "fx:id=\"txtBuscar\" was not injected: check your FXML file 'Menu_Estadisticas.fxml'.";

    }

}
