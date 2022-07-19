package com.company;

public class Automovil extends Vehiculo{

    private boolean Gas;
    private int cilindrada;

    public Automovil(String fechaCotizacion, String marca, String patente, boolean nacional, Duenio duenio, boolean Gas, int cilindrada) {
        super(fechaCotizacion, marca, patente, nacional, duenio);
        this.Gas = Gas;
        this.cilindrada = cilindrada;
    }

    public boolean esEconomico()
    {
        return Gas || cilindrada< 1200;
    }
}
