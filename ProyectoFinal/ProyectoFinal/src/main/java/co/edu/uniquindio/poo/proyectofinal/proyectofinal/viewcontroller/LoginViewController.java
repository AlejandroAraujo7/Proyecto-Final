package co.edu.uniquindio.poo.proyectofinal.proyectofinal.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnSingin;

    @FXML
    private TextField txtContrasenia;

    @FXML
    private TextField txtEmail;

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
    void onLoginUser(ActionEvent event) {
        // Lógica de inicio de sesión
    }

    @FXML
    void onSinginUser(ActionEvent event) {
        // Lógica de registro
    }

    @FXML
    void onAgregarAlCarro1(ActionEvent event) {
        // Lógica para agregar al carrito
    }

    @FXML
    void onAgregarAlCarro2(ActionEvent event) {
        // Lógica para agregar al carrito
    }

    @FXML
    void initialize() {
        assert btnAgregarAlCarro1 != null : "fx:id=\"btnAgregarAlCarro1\" was not injected: check your FXML file 'Menu_Estadisticas.fxml'.";
        assert btnAgregarAlCarro2 != null : "fx:id=\"btnAgregarAlCarro2\" was not injected: check your FXML file 'Menu_Estadisticas.fxml'.";
        assert btnEstadisticas != null : "fx:id=\"btnEstadisticas\" was not injected: check your FXML file 'Menu_Estadisticas.fxml'.";
        assert btnMuro != null : "fx:id=\"btnMuro\" was not injected: check your FXML file 'Menu_Estadisticas.fxml'.";
        assert txtBuscar != null : "fx:id=\"txtBuscar\" was not injected: check your FXML file 'Menu_Estadisticas.fxml'.";
        assert btnLogin != null : "fx:id=\"btnLogin\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnSingin != null : "fx:id=\"btnSingin\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtContrasenia != null : "fx:id=\"txtContrasenia\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'Login.fxml'.";
    }

    public void showLoginInterface() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/viewcontroller/Login.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Login");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

