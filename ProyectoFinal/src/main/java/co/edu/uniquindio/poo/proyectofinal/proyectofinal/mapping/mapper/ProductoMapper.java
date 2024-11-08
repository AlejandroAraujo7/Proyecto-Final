package co.edu.uniquindio.poo.proyectofinal.proyectofinal.mapping.mapper;

import co.edu.uniquindio.poo.proyectofinal.proyectofinal.mapping.dto.ProductoDto;
import co.edu.uniquindio.poo.proyectofinal.proyectofinal.model.Producto;

public class ProductoMapper{
    public static ProductoDto toDto(Producto producto) {
        if (producto == null) return null;
        return new ProductoDto(
                producto.getNombre(),
                producto.getImagen(),
                producto.getCategoria(),
                producto.getPrecio()
        );
    }

    // Convierte de ProductoDto a Producto
    public static Producto toEntity(ProductoDto productoDto) {
        if (productoDto == null) return null;
        return new Producto(
                productoDto.nombre(),
                productoDto.imagen(),
                productoDto.categoria(),
                productoDto.precio()
        );
    }
}
