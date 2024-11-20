package co.edu.uniquindio.proyecto_final.proyecto_final.model.builder;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Administrador;

public class AdministradorBuilder {
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String usuario;
    private String contrasena;
    private String rol;

    public AdministradorBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public AdministradorBuilder setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public AdministradorBuilder setCedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public AdministradorBuilder setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public AdministradorBuilder setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public AdministradorBuilder setContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    public AdministradorBuilder setRol(String rol) {
        this.rol = rol;
        return this;
    }

    public Administrador build() {
        return new Administrador(nombre, apellido, cedula, direccion, contrasena, rol);
    }
}
