package model;

import service.CRUD;

public class Usuario extends Persona implements CRUD<Usuario> {
    @Override
    public void crear(Usuario obj) {

    }

    @Override
    public Usuario leer(int id) {
        return null;
    }

    @Override
    public void actualizar(int id, Usuario obj) {

    }

    @Override
    public void eliminar(int id) {

    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    private String nombreUsuario;
    private String passwordUsuario;

    public Usuario(String nombre, String apellidos, String cedula, String direccion, String nombreUsuario, String passwordUsuario) {
        super(nombre, apellidos, cedula, direccion);
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
    }
}
