package com.company;

public class Edicion {
    private int numero;
    private String fechaEdicion;
    private Double precio;
    private Articulo articulos[];
    private int numeroArticulo;

    public Edicion(int numero, int cantidadArticulos)
    {
        this.numero=numero;
        articulos=new Articulo[cantidadArticulos];

    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void agregarArticulo(Articulo articulo)
    {
        articulos[numeroArticulo]=articulo;
        numeroArticulo++;
    }
}
