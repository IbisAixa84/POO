public abstract class Examen {

    private String titulo;
    private String enunciado;
    private String nombre;
    private double nota;
    private Alumno alumno;

    public Examen(Alumno alumno) // tiene que recibir el alumno ya creado, asi creo el constructor examen
    {
        this.alumno= alumno;
    }

    public double getNota() {
        return nota;
    }

    public boolean estaAprobado()
    {
        return nota>=4;
    }

}
