package com.company;

public class Socio {

    private String numeroSocio;
    private String nombre;
    //protected Double cuotaMensual;  tambien se puede generar un get(muestra linea 18 el get)- protecter es la menos recomendada para usar pierdo seguridad.
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numero, String nombre, String actividad, Double cuota) {
        numeroSocio=numero;
        this.nombre=nombre;
        cuotaMensual=cuota;
        this.actividad=actividad;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }

    public Double calcularCuotaMensual() {
        return cuotaMensual;
    }
    @Override
    public boolean equals(Object o) // comparar numero de socio- equal recibe un object
    {   if (o==null) // pregunta si esta en null(no existe)
            return false;
        if (! (o instanceof Socio)) //pregunto si es socio
            return false;
        return ((Socio)o).numeroSocio.equals(this.numeroSocio); // aclaro que es un socio, fijate si tu numero de socio es igual al numero que quieres compararte

    }

}
