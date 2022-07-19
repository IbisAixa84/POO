package com.company;

public class ClienteException extends Exception{ // creo la exepcion y se extiendo con la palabra Exception. si esta persona quiere gastar mas de lo que puede hay que hacer una exepcion

    public ClienteException(String mensaje) //en las excepciones tengo un constructor por defecto, sin parametros y constructor que recibe un string(viene generada con esos 2 constructores)
    {
        super(mensaje); // hice una excepcion que parece propia de mi programa
    }

    public String toString() //hago el toString para que mande el mensaje
    {
        return " Error en el saldo de cuenta " + this.getClass().getName() + getMessage(); // tambien puedo agregar el mensaje
    }


}
