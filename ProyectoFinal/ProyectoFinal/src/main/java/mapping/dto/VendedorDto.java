package mapping.dto;

import model.Muro;

public record VendedorDto(String nombre, String apellidos, String cedula, String direccion, Muro muroVendedor) {
}
