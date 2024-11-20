package co.edu.uniquindio.proyecto_final.proyecto_final.controler;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private List<Usuario> usuarios;

    public UsuarioController() {
        this.usuarios = new ArrayList<>();
    }

    // Crear usuario
    public void crearUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Buscar usuario por nombre de usuario
    public Usuario buscarUsuario(String nombreUsuario) {
        return usuarios.stream()
                .filter(u -> u.getUsuario().equals(nombreUsuario))
                .findFirst()
                .orElse(null);
    }

    // Eliminar usuario
    public boolean eliminarUsuario(String nombreUsuario) {
        Usuario usuario = buscarUsuario(nombreUsuario);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }

    // Listar todos los usuarios
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
