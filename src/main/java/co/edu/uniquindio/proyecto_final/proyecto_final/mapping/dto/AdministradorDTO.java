package co.edu.uniquindio.proyecto_final.proyecto_final.mapping.dto;


public class AdministradorDTO extends UsuarioDTO {
    private String rol;

    public AdministradorDTO(String nombre, String apellido, String cedula, String direccion, String usuario,
                            String rol) {
        super(nombre, apellido, cedula, direccion, usuario);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
