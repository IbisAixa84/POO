package com.company.objetos;

public class Repaso {

    public static boolean esDivisible() {
        int num1 = 20;
        int num2 = 2;

        if (num1 % num2 == 0) {
            System.out.println("Es divisible");
            return true;
        }
        return false;
    }
}