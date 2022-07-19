public class Final extends Examen implements Comparable<Final>{ // tocar la lampara roja para implementar el metodo

    private double notaOral;
    private String descripcionTema;

    public Final(Alumno alumno, String descripcionTema)
    {
        super(alumno);
        this.descripcionTema=descripcionTema;
    }
    @Override
    public boolean estaAprobado()
    {
        if (getNota()>=4&&notaOral>=4)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Final o) {
        if (promedio()>o.promedio())
        return 1;
        else if(promedio()<o.promedio())
            return -1;
        return 0;
    }

    private double promedio()
    {
        return (getNota()+notaOral)/2;
    }
}























