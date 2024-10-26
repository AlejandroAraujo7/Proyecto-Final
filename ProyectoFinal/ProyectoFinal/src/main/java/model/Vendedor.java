package model;

import java.util.ArrayList;

public class Vendedor extends Persona {

    ArrayList<Vendedor> vendedoresAliados = new ArrayList<>();
    Muro muroVendedor;
    ArrayList<Producto> listProductos = new ArrayList<Producto>();

    public Vendedor(String nombre, String apellidos, String cedula, String direccion, Muro muroVendedor) {
        super(nombre, apellidos, cedula, direccion);
        this.muroVendedor = muroVendedor;
    }

    public ArrayList<Vendedor> getVendedoresAliados() {
        return vendedoresAliados;
    }

    public Muro getMuroVendedor() {
        return muroVendedor;
    }

    public ArrayList<Producto> getListProductos() {
        return listProductos;
    }

    public void setVendedoresAliados(ArrayList<Vendedor> vendedoresAliados) {
        this.vendedoresAliados = vendedoresAliados;
    }

    public void setMuroVendedor(Muro muroVendedor) {
        this.muroVendedor = muroVendedor;
    }

    public void setListProductos(ArrayList<Producto> listProductos) {
        this.listProductos = listProductos;
    }


}
