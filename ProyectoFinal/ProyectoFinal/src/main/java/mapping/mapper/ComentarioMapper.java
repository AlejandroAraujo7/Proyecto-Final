package mapping.mapper;

import mapping.dto.ComentarioDto;
import model.Comentario;

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
