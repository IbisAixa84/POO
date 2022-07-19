import personas.Dt;
import personas.Equipo;
import personas.Jugador;
import personas.Persona;

public class Main {

    public static void main(String[] args) {

        Equipo manchester = new Equipo("Manchester");
        Jugador jugador1 = new Jugador();
        Persona jugador2 = new Jugador(00001000, "Kun", "Aguero", manchester);
        Dt dt1 = new Dt(00, "Angel", "Gallardo", 1);

        jugador1.caminar();
        jugador1.jugoBien();

        //POLIMORFISMO
        jugador1.comer("hamburguesa");
        dt1.comer("Papas fritas"); //Polimorifsmo

        jugador1.jugoBien();
        dt1.jugoBien();

        jugador1.caminar();
        dt1.caminar();
         /*dt1.caminar(2);
        jugador1.caminar(2);*/ //NO polimorfismo
        //

        jugador2.caminar();
        ((Jugador) jugador2).jugoBien();
        System.out.println(jugador2.toString());

        System.out.println("--------------------------");
        if (jugador1.equals(jugador2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        System.out.println("--------------------------");
        if (jugador1 == jugador2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }

}
