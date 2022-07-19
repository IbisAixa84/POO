package com.company;

public abstract class Cuenta {

    private double saldo;

    public void depositar(double monto) {
        saldo += monto;
    }

    public double informarSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void extraer(double monto);

    public abstract void setsaldo(int i);
}
