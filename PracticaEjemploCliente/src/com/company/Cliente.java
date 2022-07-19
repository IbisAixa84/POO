package com.company;

public class Cliente {
    private String nombre;
    private Integer numeroCuenta;
    private Double saldo;
    public static Integer numero=110;

    /*public Cliente(String nombre, Integer numero) {
        this.nombre = nombre;
        numeroCuenta = numero;
        saldo = 0.0;
    }*/

    public Cliente(String nombre) {
        numeroCuenta=numero;
        numero++;
        this.nombre = nombre;
        saldo=0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void incrementarDeuda(Double valor) {
         saldo+=valor;
    }

    public void pagarDeuda() {
         saldo=0.0;
    }

    public String toString() {
        return "Nombre: " + nombre + " Numero: " + numeroCuenta + " Saldo: " + saldo;
    }

    public static Integer verProximoNumero()
    {
       return numero;
    }
}
