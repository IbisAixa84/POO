package com.company;

import java.util.Date;

public class Tradicional extends Proyecto {

    private  Fase fase;

    public Tradicional(String fechaInicio, String fechaFinalizacion, Manager manager, Status status, Fase fase) {
        super(fechaInicio, fechaFinalizacion, manager, status);
        this.fase = fase;
    }

    public boolean seEncuentraEnFaseDiseño(){
        return Fase.DISEÑO.equals(this.fase);
    }
}
