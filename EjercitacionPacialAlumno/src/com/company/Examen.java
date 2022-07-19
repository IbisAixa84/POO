package com.company;

public abstract class Examen {

    private String titulo;
    private String enunciado;
    private double nota;
    private Alumno alumno;

    public Examen(Alumno alumno) { // es el constructor
        this.alumno= alumno;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean estaAprobado() {
        return nota>=4;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "titulo='" + titulo + '\'' +
                ", enunciado='" + enunciado + '\'' +
                ", nota=" + nota +
                ", alumno=" + alumno.toString() + // para un objeto siempre muestro con el .toString
                '}';
    }
}
