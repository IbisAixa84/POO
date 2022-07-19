package com.company;

import java.util.Arrays;

public class Edicion {
    private int numero;
    private String fechaEdicion;
    private Double precio;
    private Articulo articulos[];
    private int numeroArticulo;
    public Edicion(int numero, int cantidadArticulos) { //recibe que numero le corresponde y cuantos articulos va a tener y ese cuanto va usar para crear el array para guardar los articulos
        this.numero = numero; // necesito poner los set porque necesito saber el precio
        articulos=new Articulo[cantidadArticulos];
        numeroArticulo = 0;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void agregarArticulo(Articulo articulo) {
         articulos[numeroArticulo]=articulo;
        numeroArticulo++;
    }

    public String toString() {
        String temp="";
        for (int i=0; i<numeroArticulo; i++) {
            temp += articulos[i].toString();
        }
        return "numero: " + numero + "\nfechaEdicion: " + fechaEdicion +  "\nprecio: " + precio + "\nAticulo: " + temp +
                "\nNumero de Articulo: " + numeroArticulo;

    }

}


