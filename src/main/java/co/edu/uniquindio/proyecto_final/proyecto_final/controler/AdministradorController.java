package co.edu.uniquindio.proyecto_final.proyecto_final.controler;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Administrador;

public class AdministradorController {
    private Administrador administrador;

    public void establecerAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Administrador obtenerAdministrador() {
        return administrador;
    }

    public void actualizarAdministrador(String nombre, String apellido) {
        if (administrador != null) {
            administrador.setNombre(nombre);
            administrador.setApellidos(apellido);

        }
    }
}
