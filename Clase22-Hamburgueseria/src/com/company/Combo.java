package com.company;

import java.util.List;

public class Combo  extends Producto{

    private String nombre;
    private double descuento;
    private List<Producto> productos;

    public Combo()
    {
        super();
        productos
    }

    @Override
    public double getPrecio() {
        return 0;
    }

    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
    }

    public String getNombre()
    {
        return nombre;
    }

}
