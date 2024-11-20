package co.edu.uniquindio.proyecto_final.proyecto_final.model.clases;
import co.edu.uniquindio.proyecto_final.proyecto_final.model.services.CRUDAdministrador;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario implements CRUDAdministrador{
    private static List<Administrador> administradores = new ArrayList<>();

    // Constructor
    public Administrador(String nombre, String apellidos, String cedula, String direccion, String usuario, String contrasena) {
        super(nombre, apellidos, cedula, direccion, usuario, contrasena);
    }

    // Métodos CRUD
    @Override
    public boolean create(Administrador administrador) {
        return administradores.add(administrador);
    }

    @Override
    public Administrador read(String cedula) {
        return administradores.stream().filter(a -> a.getCedula().equals(cedula)).findFirst().orElse(null);
    }

    @Override
    public boolean update(Administrador administrador) {
        Administrador existente = read(administrador.getCedula());
        if (existente != null) {
            administradores.remove(existente);
            administradores.add(administrador);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String cedula) {
        Administrador administrador = read(cedula);
        return administrador != null && administradores.remove(administrador);
    }

    @Override
    public List<Administrador> getAllAdministrador() {
        return administradores;
    }

    @Override
    public String getRol() {
        return "Administrador";
    }
}
