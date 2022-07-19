package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertas;

    public Instituto(String nombre) //constructor
    {
        this.nombre = nombre;
        ofertas = new ArrayList<>();
    }

    public void generarInforme() // si tiene que mostrar en pantalla es un void, puedes ser un string porque lo muestro en el main
    {
        for (OfertaAcademica oferta : ofertas)
            System.out.println(oferta.mostrarDatos());
    }

    public void agregarOfertaAcademica(OfertaAcademica oferta)
    {
        ofertas.add(oferta);
    }


}
