
package co.edu.uniquindio.proyecto_final.proyecto_final.proxy;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Usuario;
import co.edu.uniquindio.proyecto_final.proyecto_final.model.services.CRUDUsuario;

import java.util.List;

public class UsuarioServiceProxy implements CRUDUsuario {

    private final CRUDUsuario usuarioService;
    private final String role;

    public UsuarioServiceProxy(CRUDUsuario usuarioService, String role) {
        this.usuarioService = usuarioService;
        this.role = role;
    }

    @Override
    public void createUsuario(String username, String password) {
        if (role.equals("ADMIN")) {
            usuarioService.createUsuario(username, password);
        } else {
            throw new SecurityException("Access denied: Only admins can create users.");
        }
    }

    @Override
    public boolean createUsuario(Usuario usuario) {
        return false;
    }

    @Override
    public Usuario readUsuario(String cedula) {
        return null;
    }

    @Override
    public boolean updateUsuario(Usuario usuario) {
        return false;
    }

    @Override
    public boolean deleteUsuario(String username) {
        if (role.equals("ADMIN")) {
            usuarioService.deleteUsuario(username);
        } else {
            throw new SecurityException("Access denied: Only admins can delete users.");
        }
        return false;
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return List.of();
    }

    @Override
    public void updateUsuario(String username, String newPassword) {
        if (role.equals("ADMIN")) {
            usuarioService.updateUsuario(username, newPassword);
        } else {
            throw new SecurityException("Access denied: Only admins can update users.");
        }
    }

    @Override
    public void viewUsuario(String username) {
        usuarioService.viewUsuario(username);
    }
}
