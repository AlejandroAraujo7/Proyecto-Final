package mapping.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record MensajeDto(LocalTime horaEnvio, LocalDate fechaEnvio, boolean visto) {
}