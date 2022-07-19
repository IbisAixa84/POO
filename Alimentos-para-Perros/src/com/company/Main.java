package com.company;

import java.util.Scanner;

public class Main {
    public static int calcularPaquetes(int cant)
    {   Scanner scanner = new Scanner(System.in);
        double pesoAcumulado;
        double pesoPaquete;
        int contador=0;
        System.out.println("Ingrese peso paquete");
        pesoPaquete=scanner.nextDouble();
        pesoAcumulado=pesoPaquete;
        contador++;
        while(cant>pesoAcumulado)
        {
            System.out.println("Ingrese peso paquete");
            pesoPaquete=scanner.nextFloat();
            pesoAcumulado+=pesoPaquete;
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String nombre;
        int cantidad;
        int cantidadPaquetes;
        System.out.println("Ingrese nombre del perro: ");
        nombre= scanner.nextLine();
        System.out.println("Peso diario de alimento: ");
        cantidad= scanner.nextInt();
        cantidadPaquetes= calcularPaquetes(cantidad);
        System.out.println("Se necesitan " + cantidadPaquetes + " para alimentar a " + nombre);

    }
}