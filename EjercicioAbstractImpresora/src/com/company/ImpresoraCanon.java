package com.company;

import java.util.Date;

public class ImpresoraCanon extends Impresora {

    public ImpresoraCanon(String modelo, Date fechaFabricacion, String tipoConexion)
    {
        super(modelo, fechaFabricacion, tipoConexion);
    }

    @Override
    public String imprimir() {
        System.out.println("Se esta imprimiendo en una impresora");
        return null;
    }
    @Override
    public boolean necesitarTinta()
    {
        return super.necesitaTinta();
    }
}
