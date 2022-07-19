package animales;

import java.util.Objects;

public class Perro extends Animal implements Mascota {

    private String raza;

    public Perro (String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }

    public Perro () {
        super("pepito", 2);
        this.raza = "golden";
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau!");
    }

    public void pasear() {
        System.out.println(getNombre() + " fue a pasear");
    }

    @Override
    public void jugar(){
        System.out.println("La mascota " + getNombre() + " esta jugando");
    }

    @Override
    public void jugar(String nombreMascota){
        System.out.println(nombreMascota + " le gusta jugar");
    }

    public void pasear(String lugar) {
        System.out.println(getNombre() + " fue a pasear a " + lugar);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object perro) {
        boolean sonIguales = false;
        Perro perroCasteado = (Perro) perro;
        if(perroCasteado.getRaza().equals(this.raza) && perroCasteado.getNombre().equals((getNombre()))) {
            sonIguales = true;
        }
        return sonIguales;
    }

    @Override
    public String toString() {
        return "Perro {" +
                "nombre='" + getNombre() + '\'' +
                "edad='" + getEdad() + '\'' +
                "raza='" + raza + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(raza);
    }
}
