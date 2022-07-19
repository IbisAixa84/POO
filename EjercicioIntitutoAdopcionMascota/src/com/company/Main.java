package com.company;

public class Main {
    public static void main(String[] args) {
        Perro firulais = new Perro("firulais", "callejero", "12052011", 3);
        firulais.setChip(false);
        firulais.setAdopcion(false);

        System.out.println(firulais.toString());
        System.out.println("Sepuede adoptar: " +firulais.sePuedeAdoptar());
    }
}