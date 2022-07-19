package com.company;

public class Unidad extends Producto{

    private double precio;


    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
}
