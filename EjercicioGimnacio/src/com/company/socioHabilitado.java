package com.company;

public class socioHabilitado extends Socio{ // estoy heredando. Con la palabra extends heredo todo lo que hay en socio

    private Double costoPileta;
    private Boolean  habilitado;

    public socioHabilitado(String numero, String nombre, String actividad, Double cuota, Double costoPileta)
    {
        super(numero, nombre, actividad, cuota); // clase socio se hace cargo de su parte. Se debe agregar en el mismo orde de constructor Socio
        this.costoPileta=costoPileta;
    }

    @Override
    public Double calcularCuotaMensual() //    @Override (avisa si cometes un error) va en donde se sobreescribe y te ayuda si te equivocas al escribir
    {
        //return getCuotaMensual()+costoPileta;  si no pongo protecte logro que este protegido(tengo mayor seguridad)
        return super.calcularCuotaMensual()+costoPileta; // super se puede usar cuantas veces quiera.- Mas recomendable es usar super
    }

}
