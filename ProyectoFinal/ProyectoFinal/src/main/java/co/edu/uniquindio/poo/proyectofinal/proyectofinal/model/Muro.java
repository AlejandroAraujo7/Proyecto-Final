package co.edu.uniquindio.poo.proyectofinal.proyectofinal.model;

import co.edu.uniquindio.poo.proyectofinal.proyectofinal.service.CRUD;

import java.util.ArrayList;

public class Muro implements CRUD<Muro> {
    ArrayList<Mensaje> listMensaje = new ArrayList<>();
    ArrayList<Publicacion> listPublicaciones = new ArrayList<>();

    @Override
    public void crear(Muro obj) {

    }

    @Override
    public Muro leer(int id) {
        return null;
    }

    @Override
    public void actualizar(int id, Muro obj) {

    }

    @Override
    public void eliminar(int id) {

    }
}
