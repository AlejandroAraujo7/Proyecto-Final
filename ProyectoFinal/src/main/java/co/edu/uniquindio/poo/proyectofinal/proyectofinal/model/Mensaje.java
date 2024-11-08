package co.edu.uniquindio.poo.proyectofinal.proyectofinal.model;

import co.edu.uniquindio.poo.proyectofinal.proyectofinal.service.CRUD;

import java.time.LocalDate;
import java.time.LocalTime;

public class Mensaje implements CRUD<Mensaje> {
    LocalTime horaEnvio;
    LocalDate fechaEnvio;
    boolean visto;

    public Mensaje(LocalTime horaEnvio, LocalDate fechaEnvio, boolean visto) {
        this.horaEnvio = horaEnvio;
        this.fechaEnvio = fechaEnvio;
        this.visto = visto;
    }

    @Override
    public void crear(Mensaje obj) {

    }

    @Override
    public Mensaje leer(int id) {
        return null;
    }

    @Override
    public void actualizar(int id, Mensaje obj) {

    }

    @Override
    public void eliminar(int id) {

    }

    public LocalTime getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(LocalTime horaEnvio) {
        this.horaEnvio = horaEnvio;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
}
