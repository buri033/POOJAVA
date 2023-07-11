package Ejercicio;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private Integer edad;
    private ArrayList<Asignatura> materias = new ArrayList<>();

    public Alumno(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }//fin constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }//fin getters y setters

    public double promedio() {
        double acum = 0;
        for (Asignatura x : materias) {
            acum += x.getNota();
        }
        return acum / materias.size();//nos da el promedio
    }

    public void adMaterias(Asignatura materia) {
        if (materias.contains(materia)) {
            System.out.println("Ya existe");
        } else {
            materias.add(materia);
        } // FIN condicional

    }//fin metodo

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", \nmaterias=" + materias +
                ", \npromedio=" + promedio() +
                '}';
    }
}