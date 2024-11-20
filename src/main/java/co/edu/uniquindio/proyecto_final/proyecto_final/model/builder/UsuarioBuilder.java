package co.edu.uniquindio.proyecto_final.proyecto_final.model.builder;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Usuario;

public class UsuarioBuilder {
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String usuario;
    private String contrasena;

    public UsuarioBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public UsuarioBuilder setCedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public UsuarioBuilder setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public UsuarioBuilder setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public UsuarioBuilder setContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    public Usuario build() {
        return new Usuario(nombre, apellido, cedula, direccion, usuario, contrasena);
    }
}
