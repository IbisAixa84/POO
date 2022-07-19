package com.company;

public class Perro {
    private String nombre;
    private String raza;
    private String fechaNacimiento;
    private double peso;
    private boolean chip;
    private boolean adopcion;
    private boolean estaLastimado;

    public Perro(String nombre, String raza, String fechaNacimiento, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }

    public Perro(String nombre, String raza, String fechaNacimiento, double peso, boolean chip, boolean adopcion, boolean estaLastimado) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.adopcion = adopcion;
        this.estaLastimado = estaLastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean getAdopcion() {
        return adopcion;
    }

    public void setAdopcion(boolean adopcion) {
        this.adopcion = adopcion;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public boolean puedePerderse() {
        return !chip;
    }

    public boolean sePuedeAdoptar() {
        return !adopcion && !estaLastimado && peso > 5;
    }

    public String toString()
    {
        return "Nombre: " + nombre + ", Puede perderse: " + puedePerderse() + ", Se puede adoptar: " + estaLastimado + ", peso: " +peso;
    }
}

