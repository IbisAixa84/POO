package com.company;

public class Main {

    public static void main(String[] args) {

        //Creamos la seleccion argentina con el plantel
        Seleccion seleccion = new Seleccion("Argentina");

        seleccion.agregarJugador(new Jugador("Pumpido",1,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",2,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",3,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",4,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",5,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",6,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",7,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",8,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",9,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",10,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",11,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",12,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",13,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",14,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",15,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",16,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",17,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",18,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",19,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",20,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",21,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",22,"ARQUERO" ));
        seleccion.agregarJugador(new Jugador("Pumpido",23,"ARQUERO" ));

        // PRUEBA DEL METODO OBTENERrESERVAS()
        ArryList<Jugador> jugadoresReserva = seleccion.obtenerReservas();
        System.out.println("Jugadores de Reserva ");
        for(Jugador jugador: jugadoresReserva)
            System.out.println(jugador.getApellido());

        // Prueba del metodo cantJugadores() y atrapar la excepcion.
        try {
            System.out.println("cantidad de Defensores: " + seleccion.cantJugadores());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}