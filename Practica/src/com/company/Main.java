package com.company;

import java.util.Scanner;

public class Main {

    public static String ingresarFechanacimiento()
    {
        int dia, mes, anio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su dia de nacimiento: ");
        dia = scanner.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        mes = scanner.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        anio = scanner.nextInt();
        return dia + "/" + mes + "/" + anio;
    }

    public static void mostrarResultados(String iniciales, String fecha) {

        System.out.println(iniciales + " Fecha de nacimiento: " + fecha);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido;
        String iniciales;
        String fecha;
        int valor;
        System.out.println("Ingrese valor: ");
        valor= scanner.nextInt();
        System.out.println("Ingrese su nombre: ");
        nombre= scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido= scanner.nextLine();
        iniciales= ""+ nombre.charAt(0) + apellido.charAt(0);
        System.out.println(iniciales);
        iniciales= nombre.substring(0,1) + apellido.substring(0,1);
        System.out.println(iniciales);
        fecha= ingresarFechanacimiento();

        mostrarResultados(iniciales,fecha);

    }

    public static class EsDivisible {
    }
}





