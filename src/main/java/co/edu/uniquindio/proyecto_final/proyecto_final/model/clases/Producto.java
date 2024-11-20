package co.edu.uniquindio.proyecto_final.proyecto_final.model.clases;

// Producto

import co.edu.uniquindio.proyecto_final.proyecto_final.model.services.CRUDProducto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Producto implements CRUDProducto {
    private static List<Producto> productos = new ArrayList<>();
    private String nombre;
    private String imagen;
    private String categoria;
    private double precio;
    private Estado estado;
    private Date fechaPublicacion;

    // Constructor
    public Producto(String nombre, String imagen, String categoria, double precio, Estado estado, Date fechaPublicacion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = estado;
        this.fechaPublicacion = fechaPublicacion;
    }

    // Getters y Setters

    public static List<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(List<Producto> productos) {
        Producto.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    // ...

    // Métodos CRUD
    @Override
    public boolean create(Producto producto) {
        return productos.add(producto);
    }

    @Override
    public Producto read(int id) {
        return productos.stream().filter(p -> p.hashCode() == id).findFirst().orElse(null);
    }

    @Override
    public boolean update(Producto producto) {
        Producto existente = read(producto.hashCode());
        if (existente != null) {
            productos.remove(existente);
            productos.add(producto);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Producto producto = read(id);
        return producto != null && productos.remove(producto);
    }

    @Override
    public List<Producto> getAllProductos() {
        return productos;
    }

    @Override
    public List<Producto> getByEstado(String estado) {
        return productos.stream().filter(p -> p.getEstado().name().equalsIgnoreCase(estado)).toList();
    }

}