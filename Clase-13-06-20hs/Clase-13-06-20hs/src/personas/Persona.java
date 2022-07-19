package personas;

public abstract class Persona {

    private int dni;
    private String nombre;
    private  String apellido;

    public Persona (int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido= apellido;
    }

    public abstract void caminar();
    public abstract boolean jugoBien();

    public String comer(String comida) {
        return (this.nombre + " comio " + comida);
    }

    @Override
    public boolean equals(Object o) {
        /*boolean sonIguales = false;
        Jugador jugadorCasteado = (Jugador)o;

        if(getDni() == jugadorCasteado.getDni()) {
            sonIguales = true;
        }*/
        return this.dni == ((Persona)o).getDni();
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}
