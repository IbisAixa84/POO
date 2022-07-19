package com.company;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo;
        Duenio pablo= new Duenio("Pablo","Sayago","1234");
        Vehiculo automovil1= new Automovil("20-12-2021","Ford","222",false, pablo,true,1300);

        System.out.println("resultado 1= " + automovil1.esIndustriaNacional());

        Camion camion1= new Camion("05-06-2021","Chebrolet", "56487", true, pablo, 6, 5000.0);
        System.out.println("resultado 2= " + camion1.compareTo()
    }
}