package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Habilidad{

    private int multiplicador;
    private List<Habilidad> habilidades;

    public Combinada() {
        habilidades = new ArrayList<>();
    }

    @Override
    public double calcularPuntaje() {
        double total= 0;
        for(Habilidad habilidad:habilidades)
            total+=habilidad.calcularPuntaje();
        total-= total*multiplicador;
        return total;
    }

    @Override
    public String mostrarDatos() {

        return "nombre: " + getNombre() + ", puntaje: " + calcularPuntaje();
    }

    public void agregarOferta(Habilidad habilidad)
    {
        habilidades.add(habilidad);
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }
}
