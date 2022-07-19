package com.company;

public class Jugador {

    private String apellido;
    private int nroCamiseta;
    private String posicion;


    public Jugador(String apellido, int nroCamiseta, String posicion)
    {
        this.apellido=apellido;
        this.nroCamiseta=nroCamiseta;
        this.posicion=posicion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }
}
