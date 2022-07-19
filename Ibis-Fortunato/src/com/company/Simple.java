package com.company;

public class Simple extends Habilidad{

    private double puntaje;

    @Override
    public double calcularPuntaje() {
        if(getNombre().equalsIgnoreCase("disparo")){
            return (puntaje + puntaje*0.1);
        }
        return puntaje;
    }

    @Override
    public String mostrarDatos() {
            return "nombre: " + getNombre() + ", puntaje: " + calcularPuntaje();
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
}
