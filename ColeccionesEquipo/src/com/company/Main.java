package com.company;

public class Main {
    public static void main(String[] args) {

        Equipo equipo= new Equipo("River"); //asignar nombre al equipo

        equipo.addJugador(new Jugador(22,"Pablo", true));
        equipo.addJugador(new Jugador(10,"Lautaro", true));
        equipo.addJugador(new Jugador(11,"Guadalupe", true));
        equipo.addJugador(new Jugador(4,"Ibis", true));
        equipo.mostrandoJugadorestitulares();
        equipo.jugadorLesionado(22);


        System.out.println(equipo.cantidadJugadoresLesionados());
    }
}