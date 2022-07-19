package com.company;

public class Main {
    public static void main(String[] args) {
        Embarcacion embarcacion;
        Capitan capitan= new Capitan("Pablo", "Sayago", "2543");
        Velero velero1= new Velero(150.000, 50.000, 2021, capitan, 10 );
        Yate yate1= new Yate(200.000, 100.000, 2020, capitan, 15);
        Yate yate2= new Yate(120.000, 110.000, 2022, capitan, 10);


        System.out.println("Respuesta 1: " + velero1.calcularMontoAlquiler());
        System.out.println("Respuesta 1, alquiler yate2: " + yate2.calcularMontoAlquiler());
        System.out.println("Respuesta 2: " + yate1.compareTo(yate2));
        System.out.println("Respuesta 3, cantidad de camarotes: " + yate1.getCantidadCamarotes());
        System.out.println("Respuesta 3, cantidad de mastiles: " + velero1.getCantidaMastiles());

    }
}