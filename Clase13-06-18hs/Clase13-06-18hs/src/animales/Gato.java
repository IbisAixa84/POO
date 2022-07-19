package animales;

public class Gato extends Animal implements Mascota,Felino {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau!");
    }

    public void pasear() {
        System.out.println("el gato " +getNombre() + " fue a pasear");
    }

    @Override
    public void jugar() {

    }

    @Override
    public void jugar(String nombreMascota) {

    }

    @Override
    public void treparArbol() {
        System.out.println(getNombre()+ " se trepo a un arbol");
    }
}
