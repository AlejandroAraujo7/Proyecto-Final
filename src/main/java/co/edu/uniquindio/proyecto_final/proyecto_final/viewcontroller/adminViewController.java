package co.edu.uniquindio.proyecto_final.proyecto_final.viewcontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.Label;

public class adminViewController {

    // FXML variables
    @FXML
    private TabPane tabPane;

    @FXML
    private Tab vendedoresTab;

    @FXML
    private Tab estadisticasTab;

    @FXML
    private Label labelAdmin;

    // Method that gets called when the FXML is loaded
    public void initialize() {
        // You can initialize your view components here
        // For example, setting up event handlers for the tabs
        System.out.println("LoginView loaded");

        // You can handle actions when the tabs change
        tabPane.getSelectionModel().selectedItemProperty().addListener((observable, oldTab, newTab) -> {
            handleTabChange(newTab);
        });
    }

    // Handle tab changes
    private void handleTabChange(Tab selectedTab) {
        if (selectedTab == vendedoresTab) {
            System.out.println("Vendedores tab selected");
            // Add any additional logic for the "Vendedores" tab here
        } else if (selectedTab == estadisticasTab) {
            System.out.println("Estadisticas tab selected");
            // Add any additional logic for the "Estadisticas" tab here
        }
    }

    // Optional: You can define any additional methods if needed (e.g., handling button clicks)
}

