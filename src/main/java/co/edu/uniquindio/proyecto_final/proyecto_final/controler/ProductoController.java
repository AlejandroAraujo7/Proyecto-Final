package co.edu.uniquindio.proyecto_final.proyecto_final.controler;
import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.*;

import java.util.ArrayList;
import java.util.List;

public class ProductoController {
    private List<Producto> productos;

    public ProductoController() {
        this.productos = new ArrayList<>();
    }

    // Crear producto
    public void crearProducto(Producto producto) {
        productos.add(producto);
    }

    // Buscar producto por nombre
    public Producto buscarProducto(String nombre) {
        return productos.stream()
                .filter(p -> p.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    // Eliminar producto
    public boolean eliminarProducto(String nombre) {
        Producto producto = buscarProducto(nombre);
        if (producto != null) {
            productos.remove(producto);
            return true;
        }
        return false;
    }

    // Listar todos los productos
    public List<Producto> listarProductos() {
        return productos;
    }
}
