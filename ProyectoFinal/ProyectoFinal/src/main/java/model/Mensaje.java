package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Mensaje {
    LocalTime horaEnvio;
    LocalDate fechaEnvio;
    boolean visto;

    public Mensaje(LocalTime horaEnvio, LocalDate fechaEnvio, boolean visto) {
        this.horaEnvio = horaEnvio;
        this.fechaEnvio = fechaEnvio;
        this.visto = visto;
    }
}
