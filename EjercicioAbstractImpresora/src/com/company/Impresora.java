package com.company;

import java.util.Date;

public abstract class Impresora { // si hay un metodo abstracto implica que haya una clase abstracto

    private String modelo;
    private Date fechaFabricacion;
    private String tipoConexion;
    private int hojasDisponible;
    private double porcentajeTinta;

    public Impresora(String modelo, Date fechaFabricacion, String tipoConexion)
    {
        this.modelo=modelo;
        this.fechaFabricacion=fechaFabricacion;
        this.tipoConexion=tipoConexion;
    }

    public boolean tienePapel()
    {
         return hojasDisponible>=1;
    }

    public boolean necesitaTinta()
    {
        return porcentajeTinta<1.0;
    }

    public abstract String imprimir(); // metodo abstract, va sin bloque. El metodo abstracto de esta forma para asegurarme que la clase derivada realmente lo implementen.

    public abstract boolean necesitarTinta();
}
