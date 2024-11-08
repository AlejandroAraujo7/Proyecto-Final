package co.edu.uniquindio.poo.proyectofinal.proyectofinal.mapping.mapper;

import co.edu.uniquindio.poo.proyectofinal.proyectofinal.mapping.dto.PersonaDto;
import co.edu.uniquindio.poo.proyectofinal.proyectofinal.model.Muro;
import co.edu.uniquindio.poo.proyectofinal.proyectofinal.model.Persona;
import co.edu.uniquindio.poo.proyectofinal.proyectofinal.model.Vendedor;

public class PersonaMapper {
    // Convierte de Persona a PersonaDto
    public static PersonaDto toDto(Persona persona) {
        if (persona == null) return null;
        return new PersonaDto(
                persona.getNombre(),
                persona.getApellidos(),
                persona.getCedula(),
                persona.getDireccion()
        );
    }

    // Convierte de PersonaDto a Persona
    public static Persona toEntity(PersonaDto personaDto) {
        if (personaDto == null) return null;



        return new Vendedor( //
                personaDto.nombre(),
                personaDto.apellidos(),
                personaDto.cedula(),
                personaDto.direccion(),
                new Muro() //
        );
    }
}
