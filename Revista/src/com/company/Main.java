package com.company;

public class Main {
    public static void main(String[] args) {
        Articulo miArticulo=new Articulo(titulo:"aa", tema:"sss", autor:"BN", fechaArticulo:"01-01-2020");
        Revista miRevista=new Revista(nombre:"Programacion para todos", codigo:"255", periodicidad:"Mensual");
        miRevista.nuevaEdicion(cantidad:12);
        Edicion aux[]=miRevista.getEdiciones();
        aux[1].setPrecio(800.00);
        aux[1].agregarArticulo(miArticulo);

    }
}
