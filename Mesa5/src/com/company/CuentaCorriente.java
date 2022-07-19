package com.company;

public class CuentaCorriente extends Cuenta {

    private Double saldo;
    private int montoDescubierto= 500;


    public void depositar(){

    }

    public CuentaCorriente(Cliente cliente, Double saldo) {
        super(cliente);
        this.saldo = saldo;
    }

    public void extraer(){

    }

    public void utilizarDescubierto(){

    }
}
