package com.company;

public class Pedido {
    private String fecha;
    private int codigo;

    public Pedido(String fecha, int codigo, Cliente cliente) {
        this.fecha = fecha;
        this.codigo = codigo;
        cliente = cliente;
    }
}
