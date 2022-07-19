package com.company;

public abstract class Embarcacion {

    private double alquiler;
    private double valorAdicional;
    private int anioFabricacion;

    private double eslora;
    private Capitan capitan;


    public Embarcacion(double alquiler, double valorAdicional, int anioFabricacion, Capitan capitan) {
        this.alquiler = alquiler;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.capitan = capitan;
    }

    public double getAlquiler() {
        return alquiler;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public double calcularMontoAlquiler() {
        if (getAnioFabricacion()>2020)
            return getAlquiler() + this.getValorAdicional();
        return getAlquiler();
    }

}
