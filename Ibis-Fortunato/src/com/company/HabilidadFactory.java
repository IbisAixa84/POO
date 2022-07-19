package com.company;

public class HabilidadFactory {

    private static HabilidadFactory instancia;

    public static final String SIMPLE="Simple";
    public static final String COMBINADA="Combinada";

    private HabilidadFactory() {
    }

    public static HabilidadFactory getInstancia() {
        if(instancia==null)
            instancia=new HabilidadFactory();
        return instancia;
    }

    public Habilidad crearHabilidad(String codigo)
    {
        switch (codigo)
        {
            case SIMPLE:
                return new Simple();
            case COMBINADA:
                return new Combinada();
        }
        return null;
    }


}
