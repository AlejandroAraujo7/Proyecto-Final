package mapping.mapper;

import mapping.dto.AdministradorDto;
import model.Administrador;

public class AdministradorMapper {

    public static AdministradorDto toDto(Administrador administrador) {
        if (administrador == null) return null;
        return new AdministradorDto(
                administrador.getNombre(),
                administrador.getApellidos(),
                administrador.getCedula(),
                administrador.getDireccion()
        );
    }

    // Convierte de AdministradorDto a Administrador
    public static Administrador toEntity(AdministradorDto administradorDto) {
        if (administradorDto == null) return null;
        return new Administrador(
                administradorDto.nombre(),
                administradorDto.apellidos(),
                administradorDto.cedula(),
                administradorDto.direccion()
        );
    }
}
