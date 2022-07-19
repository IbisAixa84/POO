package com.company;

public class Yate extends Embarcacion implements Comparable<Yate> {

    public int cantidadCamarotes;

    public Yate(double alquiler, double valorAdicional, int anioFabricacion, Capitan capitan, int cantidadCamarotes) {
        super(alquiler, valorAdicional, anioFabricacion, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    @Override
    public int compareTo(Yate o) {
        if (cantidadCamarotes()>o.cantidadCamarotes())
            return 1;
        else if(cantidadCamarotes()<o.cantidadCamarotes())
            return -1;
        return 0;

    }

    public int cantidadCamarotes() {
        return getCantidadCamarotes();
    }
}
