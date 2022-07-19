import java.util.Scanner;

public class ClasTres {
    public static int calcularPaquetes(int cant)
    {  Scanner scanner = new Scanner(System.in);
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

