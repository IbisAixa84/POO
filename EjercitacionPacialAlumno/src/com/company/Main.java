package com.company;

public class Main {
    public static void main(String[] args) {
        Alumno alumno= new Alumno("hh", "hhh","555");
        Final final1= new Final(alumno, "jh");
        Final final2= new Final(alumno, "jh2");
        final1.setNota(8);
        final2.setNota(7);
        final1.setNotaOral(9);
        if(final1.compareTo(final2)==1);
        // cargar notas con metodos set
        System.out.println("Le fue mejor en objeto, es mayor: ");
    }
}