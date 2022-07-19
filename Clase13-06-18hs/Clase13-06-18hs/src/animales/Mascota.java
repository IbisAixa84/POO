package animales;

public interface Mascota {
    //1- no hay atributos
    //2- no hay implementaciones, SOLO las firmas
    //3- puedo implementar la cantidad de interfaces que quiera
    //4- no se instancian
    //5- sirven para agregar mas jerarquias a las clases (para agregar comportamiento mas especifico)
    //6- no hay constructores

    public void jugar();
    public void jugar(String nombreMascota);
}
