package com.company;

public class Main {
    public static void main(String[] args) {

        Socio socio= new Socio("1111", "Juan","Pesas", 5000.0);
        Socio otroSocio= new Socio("1111", "Juan","Pesas", 5000.0);
        socioHabilitado socioPileta= new socioHabilitado("1112", "Ana", "Pileta", 5000.0, 1500.0);
        System.out.println("Cuota socio con pileta: " + socioPileta.calcularCuotaMensual());
        System.out.println("Cuota socio comun: " + socio.calcularCuotaMensual());

        Actividad actividad=new Actividad(); // tiene en la clases objet ya definidos el constructor
        if (socio.equals(otroSocio))
            System.out.println("Son el mismo socio");
        {else
            System.out.println("No es el mismo socio");
        }
    }
}