package personas;

public class Dt extends Persona implements JugadorEuropeo, JugadorArgentino{

    private int cantEquiposDirigidos;

    public Dt(int dni, String nombre, String apellido, int cantEquiposDirigidos) {
        super(dni, nombre, apellido);
        this.cantEquiposDirigidos = cantEquiposDirigidos;
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " le gusta caminar");
    }

    public void caminar(int distancia) {
        System.out.println(getNombre() + " camino " + distancia + "km ");
    }

    public boolean dirigirBien() {
        return true;
    }

    @Override
    public int calcularSalarioEuros(int pesos) {
        return pesos*240;
    }

    @Override
    public boolean jugoBien() {
        return false;
    }

    public int getEquiposDirigidos() {
        return cantEquiposDirigidos;
    }

    public void setEquiposDirigidos(int cantEquiposDirigidos) {
        this.cantEquiposDirigidos = cantEquiposDirigidos;
    }

    @Override
    public String getProvincia() {
        return "Buenos Aires";
    }
}
