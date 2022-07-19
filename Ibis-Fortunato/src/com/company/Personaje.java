package com.company;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private String nombre;
    private List<Habilidad> habilidades;

    public Personaje(String nombre)
    {
        this.nombre = nombre;
        habilidades = new ArrayList<>();
    }

    public void mostrarHabilidades() {
        for (Habilidad habilidad : habilidades)
            System.out.println(habilidad.mostrarDatos());
    }

    public void agregarHabilidad(Habilidad habilidad)
    {
        habilidades.add(habilidad);
    }


}
