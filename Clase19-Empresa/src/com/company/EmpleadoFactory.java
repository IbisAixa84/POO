package com.company;

public class EmpleadoFactory {

    public static final String CODIGO_EMPLEADO_RELACION = "EMP-RD";
    public static final String CODIGO_EMPLEADO_POR_HORA = "EMP-PH";
    private static EmpleadoFactory instance;// defino la instancia

    private EmpleadoFactory()  {// su constructor es privado y no guarda informacion solo tiene q crear empleados
    }

    public static EmpleadoFactory getInstance() {
        if(instance == null) { // si nunca se instancio
            instance = new EmpleadoFactory(); // entonces que se instancie
        }
        return instance; // si ya se instancio entonces lo devuelve
    }

    public Empleado crearEmpleado(String codigo) {
        switch (codigo) {
            case CODIGO_EMPLEADO_RELACION :
                // crear empleado en relacion de dependencia
                return new EmpleadoRelacionDependencia();
            case CODIGO_EMPLEADO_POR_HORA :
                // crear y retornar un empleado por hora
                return new EmpleadoPorHora();
            default:
                return null;
        }
    }

}
