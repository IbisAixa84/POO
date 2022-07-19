package com.company;

public class Main {
    public static void main(String[] args) {
        Personaje personaje=new Personaje("Guada");

        Habilidad habilidad1=HabilidadFactory.getInstancia().crearHabilidad(HabilidadFactory.SIMPLE);

        Habilidad habilidad2=HabilidadFactory.getInstancia().crearHabilidad(HabilidadFactory.SIMPLE);
        Habilidad habilidad3=HabilidadFactory.getInstancia().crearHabilidad(HabilidadFactory.COMBINADA);

        }


    }

    public static void cargarHabilidad(Habilidad combinada, Habilidad simple) throws Exception {
        if (combinada instanceof Combinada)

    }
}