package model;

import java.util.ArrayList;

public class MarketPlace {
    Administrador administradorMarketPllace;
    ArrayList<Usuario> listUsuarios = new ArrayList<>();
    ArrayList<Vendedor> listVendedores = new ArrayList<>();

    public Administrador getAdministradorMarketPllace() {
        return administradorMarketPllace;
    }

    public void setAdministradorMarketPllace(Administrador administradorMarketPllace) {
        this.administradorMarketPllace = administradorMarketPllace;
    }
}
