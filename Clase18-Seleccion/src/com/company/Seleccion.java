package com.company;

import java.util.ArrayList;

public class Seleccion {

    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public ArrayList<Jugador> obtenerReservas()
    {
        ArrayList<Jugador> reservas = new ArrayList<>();
        // recorrer el array al reves. Los ultimos 5.
        //for(int i= jugadores.size() -1; i >= jugadores.size() - 5; i--) se puede aplicar cualquiera de los 2 for
        for (int i = jugadores.size() - 5; i <= jugadores.size() - 1; i++)
            reservas.add(jugadores.get(i));

        return reservas;

    }

    public int cantJugadores() throws Exception {
        int cont = 0;
        //posicion = posicion.toLowerCase(Locale.ROOT);
        if (posicion == "ARQUERO" || posicion == "MEDIOCAMPISTA" ||
                posicion "DELANTERO" || posicion "DEFENSOR"){

            for (Jugador jugador : jugadores) {
                if (jugador.getPosicion() == posicion)
                    cont++;
            }


        }else{
            //se dispara una excepcion si la posicion es invalida
            throw new Exception("La posicion " + posicion + " es invalida. ");

        }

    }
}


