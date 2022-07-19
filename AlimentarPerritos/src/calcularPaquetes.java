import java.util.Scanner;

public class calcularPaquetes {
    public static void main(String[] args) {

        /*Precisamos hacer un programa que nos ayude a simular la situación: Pedirá primero el nombre
          y la cantidad de comida que come el perro. La idea es que mediante una función llamada
          cuantosPaquetes indique el nombre y cuantos paquetes usará. Dada la cantidad necesaria la
          función cuantosPaquetes pedirá uno a uno los pesos de cada paquete hasta llegar a esa
          cantidad y retorna el número de paquetes que precisó.
          Ejemplo:
          Rintintin come 4 kg diarios.
          paquetes : 1.2 0.7 1.1 1.3
          resultado: Rintintin precisa 4 paquetes.
         */

        public static int calcularPaquetes(int cant;) {
            Scanner scanner = new Scanner(System.in);
            float pesoAcumulado;
            float pesoPaquete;
            int contador=0;
            System.out.println("Ingrese peso paquete:");
            pesoPaquete=scanner.nextFloat();
            pesoAcumulado=pesoPaquete;
            contador++;
            while(cant>pesoAcumulado)
            {
                System.out.println("Ingrese peso paquete");
                pesoPaquete= scanner.nextFloat();
                pesoAcumulado+=pesoPaquete;
                contador++;
            }
            return contador;
        }
        public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);
            String nombre;
            int cantidad;
            int cantidadPaquetes;
            System.out.println("Ingrese el nombre del perro:");
            nombre=scanner.nextLine();
            System.out.println("peso diario de alimento:");
            cantidad=scanner.nextInt();
            cantidadPaquetes= calcularPaquetes(cantidad);
            System.out.println("Se necesitan " + cantidadPaquetes +" para alimentar a " +nombre);
        }

    }
}