package co.edu.uniquindio.proyecto_final.proyecto_final.viewcontroller;

import co.edu.uniquindio.proyecto_final.proyecto_final.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class RegistroViewController {

    // Fields linked to FXML components
    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtEmail1;

    @FXML
    private TextField txtEmail11;

    @FXML
    private TextField txtEmail111;

    @FXML
    private TextField txtEmail1111;

    @FXML
    private TextField txtEmail11111;

    @FXML
    private CheckBox checkBoxVendedor;

    @FXML
    private CheckBox checkBoxAdministrador;

    @FXML
    private Button btnRegistrar;

    @FXML
    private Button btnLogin;  // Log in button

    // Called after FXML file is loaded
    @FXML
    public void initialize() {
        // Attach event listener to the Register button
        btnRegistrar.setOnAction(event -> handleRegister());
        btnLogin.setOnAction(this::handleLoginButton);
    }

    @FXML
    private void handleLoginButton(javafx.event.ActionEvent actionEvent) {

        ((Stage)(((Button)actionEvent.getSource()).getScene().getWindow())).close();
        loadWindow("Login_Proyecto.fxml");

    }

    // Handle the "Registrar" button click event
    private void handleRegister() {
        // Retrieve data from text fields
        String nombre = txtEmail.getText();
        String apellidos = txtEmail1.getText();
        String cedula = txtEmail11.getText();
        String direccion = txtEmail111.getText();
        String usuario = txtEmail1111.getText();
        String contrasena = txtEmail11111.getText();

        // Retrieve role selection
        boolean isVendedor = checkBoxVendedor.isSelected();
        boolean isAdministrador = checkBoxAdministrador.isSelected();

        // Output data for testing (you can replace this with actual logic)
        System.out.println("=== Datos Registrados ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Cédula: " + cedula);
        System.out.println("Dirección: " + direccion);
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + contrasena);
        System.out.println("Es Vendedor: " + isVendedor);
        System.out.println("Es Administrador: " + isAdministrador);

        // Add logic to handle the registration process here (e.g., validation, saving data)
    }

    // This method is bound to the Login button in the FXML

    private void loadWindow(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(HelloApplication.class.getResource(fxmlFile));
            AnchorPane root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
