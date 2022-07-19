package com.company;

public class Main {
    public static void main(String[] args) {

       /* int num1=15; // otra forma de aplicar exception
        int num2=0;
        float resultado=0;
        try {
            resultado= (num1) / num2;

        }
        catch (Exception e)
        {
            System.out.println("El programa finalizara, no se puede dividir por cero");
            System.out.println(resultado);
        } */

        try {
            Cliente nuevo = new Cliente("Guadalupe", "Sayago", "50231462", -10000);
            nuevo.saldarDeuda(1000);
            nuevo.comprar(50000);
        }
        catch(ClienteException c)
        {
            System.out.println(c.toString());
        }

        /*
        try {
            nuevo.saldarDeuda(1000);
        }
        catch(ClienteException c)
        {
            System.out.println(c.toString());
        }

         try {
             nuevo.comprar(50000); //
         }
         catch (ClienteException c)
         {
             System.out.println(c.toString());
         }
         */

        // excepciones se usa para generar en mi programa aviso de que algo no se esta
        // usando correctamente y eso no lo voy a permitir en mis clases porque rompe
        // toda la logica que quiero hacer.

    }
}