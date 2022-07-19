package com.company;

public class Revista {
    private int numero;
    private String nombre;
    private String codigo;
    private String periodicidad;
    private Edicion ediciones[]; // van a ser muchas variables

    public Revista(String nombre, String codigo, String periodicidad) {
        this.nombre=nombre;
        this.codigo=codigo;
        this.periodicidad=periodicidad;
        ediciones= new Edicion[100]; // quiere decir que voy a tener 100 ediciones. Es lo que necesito para que empiese a funcionar.  es la forma que el array este funcionando.
        numero=1;
    }

    public void nuevaEdicion(int cantidad) { // decido cuantos articulos voy a tener
        Edicion nueva=new Edicion(numero, cantidad); // crea una nueva edicion con un numero que la revista ya sabe cual es y cuantos articulos voy a tener. (edicion es una clase)
        ediciones[numero]=nueva;
        numero++;
    }

    public Edicion[] getEdiciones() {
        return ediciones;
    }

}























