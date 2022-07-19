package com.company;

public class Main {
    public static void main(String[] args) {

        Articulo miArticulo= new Articulo("gg", "hhh", "ww", "01-01-2010");// creando articulo
        Articulo miArticuloB= new Articulo("ilu", "pp", "iyu", "01-01-2010");
        Revista miRevista= new Revista("Hola", "255", "Mensual"); // creando revista
        miRevista.nuevaEdicion(12); // crea una edicion con 12 articulos

        Edicion misEdiciones[]= miRevista.getEdiciones(); // misEdiciones en algun momento va a tener mucha.

        misEdiciones[1].setPrecio(800.00);

        misEdiciones[1].agregarArticulo(miArticulo);
        misEdiciones[1].agregarArticulo(miArticuloB);

        System.out.println(misEdiciones[1].toString());
    }
}