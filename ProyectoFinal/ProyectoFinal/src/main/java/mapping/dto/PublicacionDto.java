package mapping.dto;

import model.Comentario;
import model.Producto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public record PublicacionDto(boolean like, LocalDate fechaPublicacion, LocalTime horaPublicacion, ArrayList<Comentario> listComentarios, Producto producto) {
}
