package co.edu.uniquindio.poo.proyectofinal.proyectofinal.model;

import co.edu.uniquindio.poo.proyectofinal.proyectofinal.service.CRUD;

import java.util.ArrayList;

public class MarketPlace implements CRUD<MarketPlace> {
    Administrador administradorMarketPllace;
    ArrayList<Usuario> listUsuarios = new ArrayList<>();
    ArrayList<Vendedor> listVendedores = new ArrayList<>();

    public Administrador getAdministradorMarketPllace() {
        return administradorMarketPllace;
    }

    public void setAdministradorMarketPllace(Administrador administradorMarketPllace) {
        this.administradorMarketPllace = administradorMarketPllace;
    }

    @Override
    public void crear(MarketPlace obj) {

    }

    @Override
    public MarketPlace leer(int id) {
        return null;
    }

    @Override
    public void actualizar(int id, MarketPlace obj) {

    }

    @Override
    public void eliminar(int id) {

    }
}
