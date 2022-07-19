package com.company;

public class Jugador implements Comparable<Jugador> {
    private int nroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    public Jugador(int nroCamiseta, String nombre, boolean titular)
    {
        this.nroCamiseta=nroCamiseta;
        this.nombre=nombre;
        this.titular=titular;
    }
    @Override
    public int compareTo(Jugador jugador) {
        if (this.nroCamiseta> jugador.nroCamiseta)
            return 1;
        if (this.nroCamiseta< jugador.nroCamiseta)
            return -1;
        return 0;
    }

    public boolean isTitular() {
        return titular;
    }

    public boolean isLesionado() { // como es booleano pone iaLesionado
        return lesionado;
    }

    public void setLesionado(boolean lesionado) { // el set permite cambiar a los jugadores como lesionado
        this.lesionado = lesionado;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    @Override
    public String toString() { // es lo que me interesa mostrar
        return "Jugador{" +
                "nroCamiseta=" + nroCamiseta +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
