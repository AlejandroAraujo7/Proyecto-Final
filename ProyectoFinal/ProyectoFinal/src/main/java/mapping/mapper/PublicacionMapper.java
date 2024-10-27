package mapping.mapper;

import mapping.dto.PublicacionDto;
import model.Publicacion;

public class PublicacionMapper {
    public static PublicacionDto toDto(Publicacion publicacion) {
        if (publicacion == null) return null;
        return new PublicacionDto(
                publicacion.isLike(),
                publicacion.getFechaPublicacion(),
                publicacion.getHoraPublicacion(),
                publicacion.getListComentarios(),
                publicacion.getProducto()
        );
    }


    public static Publicacion toEntity(PublicacionDto publicacionDto) {
        if (publicacionDto == null) return null;
        return new Publicacion(
                publicacionDto.like(),
                publicacionDto.fechaPublicacion(),
                publicacionDto.horaPublicacion(),
                publicacionDto.listComentarios(),
                publicacionDto.producto()
        );
    }
}
