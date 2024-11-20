package co.edu.uniquindio.proyecto_final.proyecto_final.model.builder;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Estado;
import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Producto;

import java.util.Date;

public class ProductoBuilder {
    private String nombre;
    private String imagen;
    private String categoria;
    private double precio;
    private Estado estado;
    private Date fechaPublicacion;

    public ProductoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder setImagen(String imagen) {
        this.imagen = imagen;
        return this;
    }

    public ProductoBuilder setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProductoBuilder setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public ProductoBuilder setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
        return this;
    }

    public Producto build() {
        return new Producto(nombre, imagen, categoria, precio, estado, fechaPublicacion);
    }
}