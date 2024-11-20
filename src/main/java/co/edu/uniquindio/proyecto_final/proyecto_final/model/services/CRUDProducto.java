package co.edu.uniquindio.proyecto_final.proyecto_final.model.services;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Producto;

import java.util.List;

public interface CRUDProducto {
    boolean create(Producto producto);
    Producto read(int id);
    boolean update(Producto producto);
    boolean delete(int id);
    List<Producto> getAllProductos();
    List<Producto> getByEstado(String estado);
}