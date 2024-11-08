package co.edu.uniquindio.poo.proyectofinal.proyectofinal.mapping.mapper;

import co.edu.uniquindio.poo.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.poo.proyectofinal.proyectofinal.model.Usuario;

public class UsuarioMapper {
    public static UsuarioDto toDto(Usuario usuario) {
        if (usuario == null) return null;
        return new UsuarioDto(
                usuario.getNombre(),
                usuario.getApellidos(),
                usuario.getCedula(),
                usuario.getDireccion(),
                usuario.getNombreUsuario(),
                usuario.getPasswordUsuario()
        );
    }

    // Convierte de UsuarioDto a Usuario
    public static Usuario toEntity(UsuarioDto usuarioDto) {
        if (usuarioDto == null) return null;
        return new Usuario(
                usuarioDto.nombre(),
                usuarioDto.apellidos(),
                usuarioDto.cedula(),
                usuarioDto.direccion(),
                usuarioDto.nombreUsuario(),
                usuarioDto.passwordUsuario()
        );
    }
}
