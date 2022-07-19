package com.company;

import java.util.Arrays;

public class Articulo {
    private String titulo;
    private String tema;
    private String autor;
    private String fechaArticulo;
    private Articulo articulo[];

    public Articulo(String titulo, String tema, String autor, String fechaArticulo) {
        this.titulo = titulo;
        this.tema = tema;
        this.autor = autor;
        this.fechaArticulo = fechaArticulo;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\ntema: " + tema + "\nautor: " + autor + "\nfechaArticulo='" + fechaArticulo;
    }
}
