package com.company;

import java.util.Scanner;

public class clase2 {

    public static String ingresarFechaNacimiento()
    { int dia,mes,anio;
        Scanner scanner= new Scanner(System.in);
        System.

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre,apellido;
        String iniciales;
        int dia,mes,anio;

        System.out.println("Ingrese su nombre");
        nombre= scanner.nextLine();
        System.out.println("Ingrese su nombre");
        apellido= scanner.nextLine();
        iniciales= ""+nombre.charAt(0) + apellido.charAt(0);
        System.out.println(iniciales);
        System.out.println("Ingrese su dia de nacimiento");
        dia=scanner.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        mes=scanner.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        anio=scanner.nextInt();
        System.out.println(iniciales + "Fecha de nacimiento: " + dia + "/" + mes + "/" + anio +"");
        iniciales = "" + dia;



    }
}