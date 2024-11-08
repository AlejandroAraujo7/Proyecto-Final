package co.edu.uniquindio.poo.proyectofinal.proyectofinal.mapping.dto;

import co.edu.uniquindio.poo.proyectofinal.proyectofinal.model.Muro;

public record VendedorDto(String nombre, String apellidos, String cedula, String direccion, Muro muroVendedor) {
}
