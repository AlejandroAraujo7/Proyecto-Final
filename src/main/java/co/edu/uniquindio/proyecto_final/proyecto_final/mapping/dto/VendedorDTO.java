package co.edu.uniquindio.proyecto_final.proyecto_final.mapping.dto;

import java.util.List;

public class VendedorDTO extends UsuarioDTO {
    private List<ProductoDTO> productos;

    public VendedorDTO(String nombre, String apellido, String cedula, String direccion, String usuario,
                       List<ProductoDTO> productos) {
        super(nombre, apellido, cedula, direccion, usuario);
        this.productos = productos;
    }

    public List<ProductoDTO> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoDTO> productos) {
        this.productos = productos;
    }
}
