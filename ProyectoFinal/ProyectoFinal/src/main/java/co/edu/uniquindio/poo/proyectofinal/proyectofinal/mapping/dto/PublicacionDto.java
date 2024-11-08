package co.edu.uniquindio.poo.proyectofinal.proyectofinal.mapping.dto;

import co.edu.uniquindio.poo.proyectofinal.proyectofinal.model.Comentario;
import co.edu.uniquindio.poo.proyectofinal.proyectofinal.model.Producto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public record PublicacionDto(boolean like, LocalDate fechaPublicacion, LocalTime horaPublicacion, ArrayList<Comentario> listComentarios, Producto producto) {
}
