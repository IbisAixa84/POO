package com.company;

import java.util.Date;

public class Agil extends Proyecto implements Comparable<Agil> {

    private int cantidadSprints;
    private int sprintActual;
    private String descripcion;

    public Agil(String fechaInicio, String fechaFinalizacion, Manager manager, Status status, int cantidadSprints, int sprintActual, String descripcion) {
        super(fechaInicio, fechaFinalizacion, manager, status);
        this.cantidadSprints = cantidadSprints;
        this.sprintActual = sprintActual;
        this.descripcion = descripcion;
    }

    //objeto1.compareTo(objeto2)
    @Override
    public int compareTo(Agil o) {
        if (o!=null && cantidadSprints>o.cantidadSprints)
             return 1;
        else if (cantidadSprints==o.cantidadSprints)
            return 0;
        return -1;
    }
}
