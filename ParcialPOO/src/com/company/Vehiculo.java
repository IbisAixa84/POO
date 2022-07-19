package com.company;

public  abstract class Vehiculo {

    private String fechaCotizacion;
    private String marca;
    private String patente;
    private boolean nacional;
    private Duenio duenio;

    public Vehiculo(String fechaCotizacion, String marca, String patente, boolean nacional, Duenio duenio) {
        this.fechaCotizacion = fechaCotizacion;
        this.marca = marca;
        this.patente = patente;
        this.nacional = nacional;
        this.duenio = duenio;
    }

    public boolean esIndustriaNacional() {
        return nacional;
    }
}
