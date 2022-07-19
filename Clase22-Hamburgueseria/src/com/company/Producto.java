package com.company;

public abstract class Producto {

    private String nombre;

    public abstract double getPrecio(); // sirve para mostrar precio y nombre del producto
    public String getNombre()
    {
        return nombre;
    }

}
