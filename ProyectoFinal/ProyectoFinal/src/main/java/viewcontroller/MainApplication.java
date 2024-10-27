package viewcontroller;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        LoginController loginController = new LoginController();
        loginController.showLoginInterface();
    }

    public static void main(String[] args) {
        launch(args);
    }
}