package co.edu.uniquindio.proyecto_final.proyecto_final.model.builder;


import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Producto;
import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Vendedor;

import java.util.List;

public class VendedorBuilder {
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String usuario;
    private String contrasena;
    private List<Producto> productos;

    public VendedorBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public VendedorBuilder setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public VendedorBuilder setCedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public VendedorBuilder setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public VendedorBuilder setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public VendedorBuilder setContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    public VendedorBuilder setProductos(List<Producto> productos) {
        this.productos = productos;
        return this;
    }

    public Vendedor build() {
        return new Vendedor(nombre, apellido, cedula, direccion, usuario, contrasena);
    }
}
