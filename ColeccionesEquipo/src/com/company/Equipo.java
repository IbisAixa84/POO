package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;// ir a import clas selleccionar metodo.util

    public Equipo(String nombre) // creo la coleccion Arraylist pàra empezar a usarla, cuando necesito iniciar cierto valores
    {
        this.nombre=nombre;
        jugadores= new ArrayList<>(); // seleccionar import java.util.list
    }

    public void addJugador(Jugador nuevo)
    {
        jugadores.add(nuevo);
    }

    public void mostrandoJugadorestitulares() // recorrer la coleccion. con un foreach es un atajo para crear la estructura
    {
        ordenarJugadores(); // hago un metodo para ordenar jugadores

        for(int i=0;i<jugadores.size();i++)
        {
            if (jugadores. get(i).isTitular())
                System.out.println(jugadores.get(i).toString());
        }
    }

    public int cantidadJugadoresLesionados()
    {
        int cantidad=0; // es para sumar la cantidad de lesionados
        for(Jugador j: jugadores) // en cada iteracion me paro en un jugador y entonces le voy a preguntar
        {
            if(j.isLesionado())
                cantidad++;
        }
        return cantidad;
    }

    public void jugadorLesionado(int nroCamiseta)
    {
       for( int i=0;i<jugadores.size();i++) // preguntar a cada de los jugadores si lo pongo como lesionados
       {
           if (nroCamiseta==jugadores.get(i).getNroCamiseta()) // pensar que quiero hacer
               jugadores.get(i).setLesionado(true); // ahi ya tengo uno lesionado
       }
    }

    public void  ordenarJugadores() // para ordenar se hace con un doble for
    {
         for (int i=0; i<jugadores.size(); i++)
             for(int j=0; j<jugadores.size()-1; j++) // hay que preguntar
                 if(jugadores.get(j).compareTo(jugadores.get(j+1))==1)
                 {
                     Jugador aux=jugadores.get(j+1);
                     jugadores.set(j+1,jugadores.get(j));
                     jugadores.set(j,aux);
                 }

    }

}
