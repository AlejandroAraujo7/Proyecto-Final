package co.edu.uniquindio.proyecto_final.proyecto_final.model.services;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Vendedor;

import java.util.List;

public interface CRUDVendedor {
    boolean create(Vendedor vendedor);
    Vendedor read(String cedula);
    boolean update(Vendedor vendedor);
    boolean delete(String cedula);
    List<Vendedor> getAllVendedor();
    boolean addAliado(String cedulaVendedor, Vendedor aliado);
    boolean removeAliado(String cedulaVendedor, Vendedor aliado);

    void createVendedor(String sellerName, String password);
}
