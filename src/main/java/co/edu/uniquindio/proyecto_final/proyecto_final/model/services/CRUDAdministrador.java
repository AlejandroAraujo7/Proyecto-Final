package co.edu.uniquindio.proyecto_final.proyecto_final.model.services;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Administrador;

import java.util.List;

public interface CRUDAdministrador {
    boolean create(Administrador administrador);

    Administrador read(String cedula);

    boolean update(Administrador administrador);

    boolean delete(String cedula);

    List<Administrador> getAllAdministrador();

    void createAdministrador(String adminName, String password);
}