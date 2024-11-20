
package co.edu.uniquindio.proyecto_final.proyecto_final.facade;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.services.CRUDAdministrador;
import co.edu.uniquindio.proyecto_final.proyecto_final.model.services.CRUDUsuario;
import co.edu.uniquindio.proyecto_final.proyecto_final.model.services.CRUDVendedor;

public class MarketPlaceFacade {

    private final CRUDAdministrador adminService;
    private final CRUDUsuario userService;
    private final CRUDVendedor sellerService;

    public MarketPlaceFacade(CRUDAdministrador adminService, CRUDUsuario userService, CRUDVendedor sellerService) {
        this.adminService = adminService;
        this.userService = userService;
        this.sellerService = sellerService;
    }

    public void createUser(String username, String password) {
        userService.createUsuario(username, password);
    }

    public void deleteUser(String username) {
        userService.deleteUsuario(username);
    }

    public void createSeller(String sellerName, String password) {
        sellerService.createVendedor(sellerName, password);
    }

    public void createAdmin(String adminName, String password) {
        adminService.createAdministrador(adminName, password);
    }
}
