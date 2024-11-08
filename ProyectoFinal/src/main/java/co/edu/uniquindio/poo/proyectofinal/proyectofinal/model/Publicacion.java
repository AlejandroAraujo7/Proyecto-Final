package co.edu.uniquindio.poo.proyectofinal.proyectofinal.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Publicacion {
    boolean like;
    LocalDate fechaPublicacion;
    LocalTime horaPublicacion;
    ArrayList<Comentario> listComentarios = new ArrayList<>();
    Producto producto;

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalTime getHoraPublicacion() {
        return horaPublicacion;
    }

    public void setHoraPublicacion(LocalTime horaPublicacion) {
        this.horaPublicacion = horaPublicacion;
    }

    public ArrayList<Comentario> getListComentarios() {
        return listComentarios;
    }

    public void setListComentarios(ArrayList<Comentario> listComentarios) {
        this.listComentarios = listComentarios;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Publicacion(boolean like, LocalDate fechaPublicacion, LocalTime horaPublicacion, ArrayList<Comentario> listComentarios, Producto producto) {
        this.like = like;
        this.fechaPublicacion = fechaPublicacion;
        this.horaPublicacion = horaPublicacion;
        this.listComentarios = listComentarios;
        this.producto = producto;
    }
}
