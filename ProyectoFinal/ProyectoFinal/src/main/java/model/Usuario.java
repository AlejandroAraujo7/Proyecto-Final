package model;

public class Usuario extends Persona {
    private String nombreUsuario;
    private String passwordUsuario;

    public Usuario(String nombre, String apellidos, String cedula, String direccion, String nombreUsuario, String passwordUsuario) {
        super(nombre, apellidos, cedula, direccion);
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
    }
}
