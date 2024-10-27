package model;

import service.CRUD;

public class Administrador extends Persona implements CRUD<Administrador> {

    @Override
    public void crear(Administrador obj) {

    }

    @Override
    public Administrador leer(int id) {
        return null;
    }

    @Override
    public void actualizar(int id, Administrador obj) {

    }

    @Override
    public void eliminar(int id) {

    }

    public Administrador(String nombre, String apellidos, String cedula, String direccion) {
        super(nombre, apellidos, cedula, direccion);
    }
}
