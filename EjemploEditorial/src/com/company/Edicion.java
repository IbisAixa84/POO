package com.company;

public class Edicion {
    private int numero;
    private String fechaEdicion;
    private Double precio;
    private Articulo articulo[];
    private int numeroArticulo;

    public Edicion(int numero, int cantidadArticulos) {
        this.numero = numero;
        articulo= new Articulo[cantidadArticulos];
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public void agregarArticulo(Articulo articulo)
    {
       articulo[numeroArticulo]=articulo;
       numeroArticulo++;
    }
}
