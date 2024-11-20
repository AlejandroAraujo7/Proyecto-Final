package co.edu.uniquindio.proyecto_final.proyecto_final.model.clases;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.services.CRUDVendedor;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario implements CRUDVendedor {
    private List<Vendedor> redDeVendedores = new ArrayList<>();
    private List<Producto> listaDeProductos = new ArrayList<>();

    // Constructor
    public Vendedor(String nombre, String apellidos, String cedula, String direccion, String usuario, String contrasena) {
        super(nombre, apellidos, cedula, direccion, usuario, contrasena);
    }

    // Getters y Setters específicos
    public List<Vendedor> getRedDeVendedores() {
        return redDeVendedores;
    }

    public void setRedDeVendedores(List<Vendedor> redDeVendedores) {
        this.redDeVendedores = redDeVendedores;
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    @Override
    public boolean create(Vendedor vendedor) {
        return false;
    }

    @Override
    public Vendedor read(String cedula) {
        return null;
    }

    @Override
    public boolean update(Vendedor vendedor) {
        return false;
    }

    @Override
    public boolean delete(String cedula) {
        return false;
    }

    @Override
    public List<Vendedor> getAllVendedor() {
        return List.of();
    }

    // Métodos específicos
    @Override
    public boolean addAliado(String cedulaVendedor, Vendedor aliado) {
        Vendedor vendedor = (Vendedor) read(cedulaVendedor);
        if (vendedor != null && vendedor.getRedDeVendedores().size() < 10) {
            return vendedor.getRedDeVendedores().add(aliado);
        }
        return false;
    }

    @Override
    public boolean removeAliado(String cedulaVendedor, Vendedor aliado) {
        Vendedor vendedor = (Vendedor) read(cedulaVendedor);
        return vendedor != null && vendedor.getRedDeVendedores().remove(aliado);
    }

    @Override
    public void createVendedor(String sellerName, String password) {

    }

    @Override
    public String getRol() {
        return "Vendedor";
    }
}