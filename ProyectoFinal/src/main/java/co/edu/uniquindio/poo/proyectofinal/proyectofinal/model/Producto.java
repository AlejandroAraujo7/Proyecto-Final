package co.edu.uniquindio.poo.proyectofinal.proyectofinal.model;

import co.edu.uniquindio.poo.proyectofinal.proyectofinal.service.CRUD;

import javax.swing.*;

public class Producto implements CRUD<Producto> {
    @Override
    public void crear(Producto obj) {

    }

    @Override
    public Producto leer(int id) {
        return null;
    }

    @Override
    public void actualizar(int id, Producto obj) {

    }

    @Override
    public void eliminar(int id) {

    }

    private String nombre;
    private ImageIcon imagen;
    private String categoria;
    private float precio;

    public Producto(String nombre, ImageIcon imagen, String categoria, float precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
