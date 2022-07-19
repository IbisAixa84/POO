package com.company;

public class Camion extends Vehiculo implements Comparable<Camion>{

    private int cantidadEjes;
    private double capacidadCarga;

    public Camion(String fechaCotizacion, String marca, String patente, boolean nacional, Duenio duenio, int cantidadEjes, double capacidadCarga) {
        super(fechaCotizacion, marca, patente, nacional, duenio);
        this.cantidadEjes = cantidadEjes;
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public int compareTo(Camion o) {
        if (o!=null && capacidadCarga> o.getCapacidadCarga())
            return 1;
        else if (capacidadCarga==o.getCapacidadCarga())
            return 0;
        return -1;
    }
}
