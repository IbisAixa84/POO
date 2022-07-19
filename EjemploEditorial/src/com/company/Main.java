package com.company;

public class Main {

    public static void main(String[] args) {

        Articulo miArticulo= new Articulo("aaa","aaa","AB","01-01-2020");
        Revista miRevista=new Revista("Programacion para todos", "255", "mensual");
        miRevista.nuevaEdicion(12);
        Edicion misEdiciones[]= miRevista.getEdiciones();
        misEdiciones[1].setPrecio(800.00);
        misEdiciones[1].agregarArticulo(miArticulo);
    }
}
