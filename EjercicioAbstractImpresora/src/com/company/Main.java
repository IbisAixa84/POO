package com.company;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date dia= new Date(); // es un objeto por eso se crea
        Impresora impresora;//= new Impresora("Epson", dia, "USB"); // no se puede crear objeto
        //si se puede definir el nombre de la impresora, se pueden crear objeto de su derivada
        Impresora impresora1 = null;
        ImpresoraEpson epson=new    ImpresoraEpson("Epson", dia, "USB");
        impresora=new ImpresoraEpson("Epson", dia, "USB");
        //impresora=new ImpresoraEpson("Epson", dia, "USB");
        ImpresoraCanon canon= new ImpresoraCanon("Epson", dia, "USB");
        String texto= impresora.imprimir();
        System.out.println(texto);

        int[] datos= new int[10];
        Impresora[] impresoras=new Impresora[2];
        impresoras[0]=impresora;
        impresoras[1]=impresora1;
        
        for (int i =0; i<impresoras.length; i++)
            System.out.println(impresoras[i].imprimir());

    }

}

































