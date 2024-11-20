package co.edu.uniquindio.proyecto_final.proyecto_final.model.services;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Usuario;

import java.util.List;

public interface CRUDUsuario {
    boolean createUsuario(Usuario usuario);
    Usuario readUsuario(String cedula);
    boolean updateUsuario(Usuario usuario);
    boolean deleteUsuario(String cedula);
    List<Usuario> getAllUsuario();
}