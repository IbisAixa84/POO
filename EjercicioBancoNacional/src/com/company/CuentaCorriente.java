package com.company;

public class CuentaCorriente {

    private double decubiertoPermitido;

    public double getDecubiertoPermitido() {
        return decubiertoPermitido;
    }

    public void setDecubiertoPermitido(double decubiertoPermitido) {
        this.decubiertoPermitido = decubiertoPermitido;
    }

    @Override
    public void extraer(double monto) {
        if(informarSaldo() + descubiertoPermitido <= monto)
            setSalto(informarSaldo() - monto);
    }
}
