package model;

import service.CRUD;

public class Comentario implements CRUD<Comentario> {
    @Override
    public void crear(Comentario obj) {

    }

    @Override
    public Comentario leer(int id) {
        return null;
    }

    @Override
    public void actualizar(int id, Comentario obj) {

    }

    @Override
    public void eliminar(int id) {

    }

    String textoComentario;

    public Comentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }

    public String getTextoComentario() {
        return textoComentario;
    }
}