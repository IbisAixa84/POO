package com.company;

import java.util.Date;

public abstract class Proyecto {

    private String fechaInicio;
    private String fechaFinalizacion;
    private Manager manager;
    private Status status;
    private String fechaFinalizacionReal;
    private String fechaInicioReal;

    public Proyecto(String fechaInicio, String fechaFinalizacion, Manager manager, Status status) {
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.manager = manager;
        this.status = status;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setFechaFinalizacionReal(String fechaFinalizacionReal) {
        this.fechaFinalizacionReal = fechaFinalizacionReal;
    }

    public String getFechaFinalizacionReal() {
        return fechaFinalizacionReal;
    }

    public boolean finalizoEnFecha()
    {
        if (Status.FINALIZADO.equals(this.status) && fechaFinalizacion.equals(fechaFinalizacionReal)) {
            return true;
        }
        return false;
    }

    //abstract public String esLargo(); polimofirmo de un metodo

}
