package com.company;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta;
        CajaAhorro ca =  new CajaAhorro();
        ca.setsaldo(100);
        ca.cobrarIntereses();



        System.out.println(ca.informarSaldo());
    }
}