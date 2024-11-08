package co.edu.uniquindio.poo.proyectofinal.proyectofinal.service;
// utilizacion de una interface generica
public interface CRUD<T> {
    void crear(T obj);
    T leer(int id); // Identificador único, como el índice o cualquier atributo único
    void actualizar(int id, T obj);
    void eliminar(int id);
}
