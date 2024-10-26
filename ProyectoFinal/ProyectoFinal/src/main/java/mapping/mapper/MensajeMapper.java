package mapping.mapper;

import mapping.dto.MensajeDto;
import model.Mensaje;

public class MensajeMapper {
    public static MensajeDto toDto(Mensaje mensaje) {
        if (mensaje == null) return null;
        return new MensajeDto(
                mensaje.getHoraEnvio(),
                mensaje.getFechaEnvio(),
                mensaje.isVisto()
        );
    }

    // Convierte de MensajeDto a Mensaje
    public static Mensaje toEntity(MensajeDto mensajeDto) {
        if (mensajeDto == null) return null;
        return new Mensaje(
                mensajeDto.horaEnvio(),
                mensajeDto.fechaEnvio(),
                mensajeDto.visto()
        );
    }
}
