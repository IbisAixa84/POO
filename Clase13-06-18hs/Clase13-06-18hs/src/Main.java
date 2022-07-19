import animales.Animal;
import animales.Gato;
import animales.Perro;

public class Main {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Zeke", 2, "Beagle");
        Animal perro2 = new Perro("Akamaru", 1, "mestizo");
        Perro perro3 = new Perro("Zeke", 2, "Beagle");
        Perro perro4 = new Perro();
        Gato gato1 = new Gato("Garfield", 3);

        //POLIMORFISMO
        perro1.hacerRuido();
        gato1.hacerRuido(); // aca imprime Miau!

        /*Perro gatoPerro = (Perro) gato1;
        gato1.hacerRuido();*/ // aca imprime Guau!

        perro1.pasear();
        gato1.pasear();
        //

        /*perro1.pasear("plaza");
        gato1.pasear("plaza");*/ //--> NO polimorfismo

        perro1.comer();
        perro1.getRaza();

        perro2.comer();
        //perro2.getRaza() --> Animal no tiene el metodo getRaza()
        Perro perro2Casteado = (Perro) perro2;
        perro2Casteado.setRaza("salchicha");
        System.out.println(perro2Casteado.getNombre());

        System.out.println("----------------------------------------------");
        if (perro1.equals(perro3)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        System.out.println("----------------------------------------------");
        if (perro1 == perro3) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales"); //se tiene que hacer con el .equals porque si no compara posiciones de memoria y siempre va a dar false p[orque son OBJETOS
        }

        System.out.println("----------------------------------------------");
        System.out.println(perro4.toString());
    }
}
