package com.company;

import com.sun.xml.internal.ws.api.message.Packet;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Proyecto proyecto;
        Manager pedroManager= new Manager("Lautaro", "Diosquez", "45738041", "1230");
        Agil proyectoAgil = new Agil("20-12-2021", "05-05-2022", pedroManager, Status.EN_INICIO, 12, 1, "como se me cante");

        Agil proyectoAgil2 = new Agil("20-12-2021", "05-05-2022", pedroManager, Status.EN_INICIO, 12, 1, "Ni idea");

        Tradicional proyectoTrad = new Tradicional("20-12-2021", "05-05-2022", pedroManager, Status.EN_INICIO, Fase.DISEÑO);

        //punto2
        System.out.println("resultado = " + proyectoAgil.compareTo(proyectoAgil2));
        //punto1
        proyectoAgil.setFechaFinalizacionReal("05-05-2022");
        proyectoAgil.setStatus(Status.FINALIZADO);
        System.out.println("resultado2 = " + proyectoAgil.finalizoEnFecha());
        //punto3
        System.out.println("resultado3 = " + proyectoTrad.seEncuentraEnFaseDiseño());


    }
}