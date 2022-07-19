package com.company;

import java.util.Date;

public class ImpresoraEpson extends Impresora { // implementar el metodo con la lampara roja

    public ImpresoraEpson(String modelo, Date fechaFabricacion, String tipoConexion) { //crear el constructor para llamar el super
        super(modelo, fechaFabricacion, tipoConexion); //se crea la impresora
    }

    @Override
    public String imprimir() { //con void no hace falta sobreescribir
        System.out.println("Se esta imprimiendo en una impresora");
        return null;
    }

    @Override
    public boolean necesitarTinta() {
        return false;
    }
}
