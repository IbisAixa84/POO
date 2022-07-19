package com.company;

public class Velero extends Embarcacion {

    private int cantidaMastiles;

    public Velero(double alquiler, double valorAdicional, int anioFabricacion, Capitan capitan, int cantidaMastiles) {
        super(alquiler, valorAdicional, anioFabricacion, capitan);
        this.cantidaMastiles = cantidaMastiles;
    }

    public int getCantidaMastiles() {
        return cantidaMastiles;
    }

}
