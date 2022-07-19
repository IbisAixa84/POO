package com.company;

public class Main {
    public static void main(String[] args) {
        Impresora miImpresora = new Impresora("HP", "USB", "2021");
        miImpresora.agregarHojas(100);
        miImpresora.imprimir("Hola");
        System.out.println(miImpresora.toString());
        miImpresora.imprimir("Hasta luego", 10);
        System.out.println(miImpresora.toString());
    }
}