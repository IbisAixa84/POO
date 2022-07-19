package com.company;

public class Cliente {
    private String nombre;
    private Integer numeroCuenta;
    private Double saldo;
    public static Integer numero=111; // se usa la variable static cuando yo genero el numero

    /*public Cliente(Integer numero, String nombre)
    {
        numeroCuenta=numero;
        this.nombre=nombre;
        saldo=0.0;
    }
    public Cliente(String nombre, Integer numeroCuenta, Double saldo)
    {
        this.nombre=nombre;
        this.numeroCuenta= numeroCuenta;
        this.saldo=saldo;
    }*/
    public Cliente(String nombre)
    {
        numeroCuenta=numero;
        numero++;
        this.nombre=nombre;
        saldo=0.0;
    }
    public Cliente(String nombre, Double saldo)
    {
        this.nombre=nombre;
        this.numeroCuenta= numero;
        numero++;
        this.saldo=saldo;
    }
    public String getNombre()
    {
        return nombre;
    }
    public Integer getNumeroCuenta()
    {
        return numeroCuenta;
    }
    public Double getSaldo()
    {
        return saldo;
    }
    public void incrementarDeuda(Double valor)
    {
         saldo+=valor;
    }
    public void pagarDeuda() {
         saldo=0.0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString()
    {
        return " Nombre: " + nombre + " Numero: " + numeroCuenta + " saldo: " + saldo;
    }

    public static Integer verProximoNumero()
    {
        return numero;
    }
}
