package personas;

import java.util.Objects;

public class Jugador extends Persona implements Retirado,JugadorEuropeo {

    private Equipo equipo;

    public Jugador(int dni, String nombre, String apellido, Equipo equipo) {
        super(dni, nombre, apellido);
        this.equipo = equipo;
    }

    public Jugador(){
        super(00001000, "Lionel", "Messi");
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " camino mucho");
    }

    @Override
    public boolean jugoBien() {
        return true;
    }

    public boolean jugoBien(int puntaje) {
        return (puntaje > 7);
    }

    @Override
    public int aniosRetirados(int anios) {
        return anios;
    }

    @Override
    public int calcularSalarioEuros(int pesos) {
        return pesos*250;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre=" + getNombre() +
                " - apellido=" + getApellido() +
                " - equipo=" + equipo.getNombre() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipo);
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
