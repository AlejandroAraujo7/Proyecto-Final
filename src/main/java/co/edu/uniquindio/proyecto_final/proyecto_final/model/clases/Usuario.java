package co.edu.uniquindio.proyecto_final.proyecto_final.model.clases;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.services.CRUDUsuario;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements CRUDUsuario {
    private static List<Usuario> usuarios = new ArrayList<>();
    private String nombre;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String usuario;
    private String contrasena;

    // Constructor
    public Usuario(String nombre, String apellidos, String cedula, String direccion, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String setApellidos(){
        return apellidos;
    }

    // Métodos abstractos
    public String getRol() {
        return "Usuario";
    }

    // Implementación de CRUDUsuario
    @Override
    public boolean createUsuario(Usuario usuario) {
        return usuarios.add(usuario);
    }

    @Override
    public Usuario readUsuario(String cedula) {
        return usuarios.stream().filter(u -> u.getCedula().equals(cedula)).findFirst().orElse(null);
    }

    @Override
    public boolean updateUsuario(Usuario usuario) {
        Usuario existente = readUsuario(usuario.getCedula());
        if (existente != null) {
            usuarios.remove(existente);
            usuarios.add(usuario);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUsuario(String cedula) {
        Usuario usuario = readUsuario(cedula);
        return usuario != null && usuarios.remove(usuario);
    }

    public List<Usuario> getAllUsuario() {
        return usuarios;
    }
}
