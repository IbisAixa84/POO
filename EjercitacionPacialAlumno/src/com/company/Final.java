package com.company;

public class Final extends Examen implements Comparable<Final>{ // atributo de la clase no necesita recibir por parametro

    private double notaOral;
    private String descripcionTema;

    public Final(Alumno alumno) {
        super(alumno);
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public boolean estaAprobado() {
        if (getNota()>=4)&&notaOral>=4)
            return true;
        else
            return false;

    }

}
