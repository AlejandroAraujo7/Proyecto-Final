package co.edu.uniquindio.proyecto_final.proyecto_final.viewcontroller;

import co.edu.uniquindio.proyecto_final.proyecto_final.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginViewcontroller {

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private Button btnSingin;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblForgotPassword;

    @FXML
    public void initialize() {
        // Attach event listener to the Register button
        btnLogin.setOnAction(this::handleLoginUser);
    }


    @FXML
    private void handleLoginUser(javafx.event.ActionEvent actionEvent) {
        ((Stage)(((Button)actionEvent.getSource()).getScene().getWindow())).close();
        loadWindow("adminitradorView.fxml");
    }

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

    @FXML
    private void onSinginUser() {
        System.out.println("Sign-in logic triggered.");
        // Add sign-in logic here
    }

    private boolean validateCredentials(String email, String password) {
        // Simple example validation logic
        return "user@example.com".equals(email) && "password".equals(password);
    }

}
