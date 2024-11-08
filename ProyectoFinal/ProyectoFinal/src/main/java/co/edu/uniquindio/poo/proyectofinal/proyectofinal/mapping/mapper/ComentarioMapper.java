package co.edu.uniquindio.poo.proyectofinal.proyectofinal.mapping.mapper;

import co.edu.uniquindio.poo.proyectofinal.proyectofinal.mapping.dto.ComentarioDto;
import co.edu.uniquindio.poo.proyectofinal.proyectofinal.model.Comentario;

public class ComentarioMapper {
    public static ComentarioDto toDto(Comentario comentario) {
        if (comentario == null) return null;
        return new ComentarioDto(comentario.getTextoComentario());
    }

    // Convierte de ComentarioDto a Comentario
    public static Comentario toEntity(ComentarioDto comentarioDto) {
        if (comentarioDto == null) return null;
        return new Comentario(comentarioDto.textoComentario());
    }
}
