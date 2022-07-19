package com.company;

import org.omg.SendingContext.RunTime;

public class Cliente {

    private String nombre;
    private String apellido;
    private String DNI;
    private double saldoEnCuenta;
    private double limite;

    public Cliente(String nombre, String apellido, String DNI, double limite) throws ClienteException {
        this.nombre=nombre;
        this.apellido=apellido;
        this.DNI=DNI;
        if(limite<0)
            throw new ClienteException(" El limite no puede ser negativo"); // esto se debe proteger en la main
        this.limite=limite;
        saldoEnCuenta=0;
    }

    public void comprar(double importe) throws ClienteException // cuando me pasan el importe de lo que acabo de comprar aumenta el saldo cuenta
    {
        if(importe+saldoEnCuenta<limite) //compra es menor a limite. La exepcion se aplica con otra clase
             saldoEnCuenta+=importe;     //entonces le permito hacer la compra
        else throw new ClienteException(" No tiene mas limite");  //aca lanzo la clase ClienteException con el mensaje
    }

    public void saldarDeuda(double importe) throws ClienteException // cuando pago el importe se lo resta del saldo de cuenta. Este metodo puede lanzar una excepcion y en la laparita roja lo acepto, es um metodo throws que puede generar una excepcion
    {
        if (saldoEnCuenta==0)
            throw new ClienteException("No hay deuda"); // aca aplico exception en ejecucion
        saldoEnCuenta-=importe;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", saldoEnCuenta=" + saldoEnCuenta +
                '}';
    }
}
