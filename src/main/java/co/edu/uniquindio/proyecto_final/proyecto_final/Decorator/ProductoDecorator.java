
package co.edu.uniquindio.proyecto_final.proyecto_final.Decorator;

import co.edu.uniquindio.proyecto_final.proyecto_final.model.clases.Producto;

public abstract class ProductoDecorator extends Producto {

    protected Producto producto;

    public ProductoDecorator(Producto producto) {
        super();
        this.producto = producto;
    }

    public abstract String getDescripcion();
}

class ProductoConDescuento extends ProductoDecorator {

    private final double descuento;

    public ProductoConDescuento(Producto producto, double descuento) {
        super(producto);
        this.descuento = descuento;
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio() - (producto.getPrecio() * descuento);
    }

    @Override
    public String getDescripcion() {
        return producto.getDescripcion() + " (con descuento del " + (descuento * 100) + "%)";
    }
}
