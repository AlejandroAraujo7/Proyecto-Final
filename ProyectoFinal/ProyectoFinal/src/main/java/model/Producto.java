package model;

import javax.swing.*;

public class Producto {
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

}
