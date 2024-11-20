package co.edu.uniquindio.proyecto_final.proyecto_final.controler;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Producto;
import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class VendedorController {
    private List<Vendedor> vendedores;

    public VendedorController() {
        this.vendedores = new ArrayList<>();
    }

    // Crear vendedor
    public void crearVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    // Buscar vendedor por nombre
    public Vendedor buscarVendedor(String nombre) {
        return vendedores.stream()
                .filter(v -> v.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    // Agregar producto a un vendedor
    public boolean agregarProducto(String nombreVendedor, Producto producto) {
        Vendedor vendedor = buscarVendedor(nombreVendedor);
        if (vendedor != null) {
            vendedor.getListaDeProductos().add(producto);
            return true;
        }
        return false;
    }

    // Listar productos de un vendedor
    public List<Producto> listarProductos(String nombreVendedor) {
        Vendedor vendedor = buscarVendedor(nombreVendedor);
        return vendedor != null ? vendedor.getListaDeProductos() : new ArrayList<>();
    }

    // Eliminar vendedor
    public boolean eliminarVendedor(String nombre) {
        Vendedor vendedor = buscarVendedor(nombre);
        if (vendedor != null) {
            vendedores.remove(vendedor);
            return true;
        }
        return false;
    }
}
