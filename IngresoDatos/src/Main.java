import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
          una tercera tus iniciales.;*/

        Scanner ingresoDatos;
        ingresoDatos= new Scanner(System.in);
        int edad;
        String nombre, apellido;
        char inicial;
        System.out.println("Ingrese nombre: ");
        nombre=ingresoDatos.nextLine();
        System.out.println("Ingrese apellido: ");
        apellido=ingresoDatos.nextLine();
        System.out.println("Ingrese edad: ");
        edad=ingresoDatos.nextInt();
    }
}