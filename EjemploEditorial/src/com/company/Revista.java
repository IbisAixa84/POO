package com.company;

public class Revista {
    private int numero;
    private String nombre;
    private String codigo;
    private String periodicidad;
    private Edicion ediciones[];

    public Revista(String nombre, String codigo, String periodicidad)
    {
        this.nombre=nombre;
        this.codigo=codigo;
        this.periodicidad=periodicidad;
        ediciones= new Edicion[100];
        numero=1;
    }
    public void nuevaEdicion(int cantidad)
    {   Edicion nueva=new Edicion(numero, cantidad);
        ediciones[numero]=nueva;
        numero++;
    }

    public Edicion[] getEdiciones() {
        return ediciones;
    }
}
