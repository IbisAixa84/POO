package com.company;

public class OfertaAcademicaFactory {
// se usa para factory instancia estatica con nombre instancia

    private static OfertaAcademicaFactory instancia;

    public static final String CURSO="Curso";                          // define una constante
    //final: es como una variable pero a oartir que le puse final se tranforma en constante y no la puedo cambiar
    //static: que la uso a travez de la clase, no esta definida para los objetos sino para las clases
    public static final String PROGRAMA="Programa";

    private OfertaAcademicaFactory() // en factory el constructor tiene que ser privado porque se crea una unica instancia
    {

    }

    public static OfertaAcademicaFactory getInstancia() {
         if(instancia==null)
             instancia=new OfertaAcademicaFactory(); //crea instancia
         return instancia;
    }

    public OfertaAcademica crearOfertaAcademica(String codigo)
    {
        switch (codigo)
        {
            case CURSO:
                return new Curso();
            case PROGRAMA:
                return new Programa();
        }
        return null;
    }

}
